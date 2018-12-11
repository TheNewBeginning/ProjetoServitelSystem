package ADO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.MarcaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import objectTransferData.ObjectData;

public class MarcaAdo {

    private Connection con;
    private ConexaoAdo minhaConexao;
    private String mensagem;

    public MarcaAdo() {
        try {
            minhaConexao = new ConexaoAdo();
            con = minhaConexao.getConexao();
        } catch (Exception e) {
            Logger.getLogger(MarcaAdo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean salvar(MarcaModel marca) throws RuntimeException {
        boolean check = false;
        if (marca.getNomeMarca().equals("")) {
            throw new RuntimeException("nome da marca está vazio ou incorreto!");
        }
        
        /*verifica se chegou Id*/
        if (marca.getIdMarca() != 0) {
            System.out.println("entrou nesse if");
            alterar(marca);
        } else {
            String query = "insert into servitel_system.marca(nome_marca) values (?);";
            try {
                java.sql.PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, marca.getNomeMarca());
                if (!stmt.execute()) {
                    this.mensagem = "Marca do Produdo inserido Com Sucesso!";
                    System.out.println(minhaConexao.getMsg());
                    check = true;
                } else {
                    System.out.println(minhaConexao.getMsg());
                    this.mensagem = "Erro ao Inserir marca do Produto!";
                    check = false;
                }
                //System.out.println(stmt);

            } catch (SQLException e) {
                ObjectData.SendToMsg("Erro ao inserir Produto");
            } finally {
                minhaConexao.fecharConexao();
            }
        }
        return check;
    }

    public boolean consultaPorNome(String nome) throws Exception {
        if (nome.equals("")) {
            throw new NullPointerException("nome está vazio");
        }
        String query = "Select nome_marca from servitel_system.marca where nome_marca = ?;";
        ResultSet rs = null;
        boolean check = false;
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            System.out.println(stmt);
            if (rs.next()) {
                this.mensagem = "Marca do Produdo já existe por favor insera outro";
                System.out.println("entrou V");

                check = true;
                System.err.println("if" + check);
            }
            System.out.println("não passou no if:" + check);
            stmt.close();

        } catch (SQLException | RuntimeException ex) {
            ex.printStackTrace();
        }finally{
            minhaConexao.fecharConexao();
        }
        return check;
    }

    public List<MarcaModel> ConsultaTodos() {
        String query = "SELECT nome_marca, id_marca" + "  FROM servitel_system.marca;";
        //List<MarcaModel> listMarca = new ArrayList<>();
        MarcaModel marcaModel = null;
        List<MarcaModel> marcaLista = new ArrayList<>();
        try {
            java.sql.PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                marcaModel = new MarcaModel();
                marcaModel.setNomeMarca(rs.getString("nome_marca"));
                marcaModel.setIdMarca(rs.getInt(2));
                marcaLista.add(marcaModel);
            }

            stmt.close();
        } catch (SQLException ex) {
            ex.getStackTrace();
            throw new RuntimeException(ex);
        }
        return marcaLista;
    }

    public boolean alterar(MarcaModel marca) {
        System.out.println("chamou alteraMarca");
        String alter = "UPDATE servitel_system.marca SET nome_marca=? WHERE id_marca = ?;";
        boolean check;

        try {
            java.sql.PreparedStatement stmt2 = con.prepareStatement(alter);
            stmt2.setString(1, marca.getNomeMarca());
            stmt2.setInt(2, marca.getIdMarca());
            if (stmt2.executeUpdate() != 0) {
                this.mensagem = "Marca do Produdo alterada Com Sucesso!";
                System.out.println(minhaConexao.getMsg());
                check = true;

            } else {
                System.out.println(minhaConexao.getMsg());
                this.mensagem = "Erro ao alterar marca do Produto!\n A marca nao existe ou foi informado dados invalidos para alteração";
                check = false;
            }
            stmt2.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            minhaConexao.fecharConexao();
        }
        return check;
    }

    public boolean excluir(int id) throws RuntimeException {
        if (id == 0) {
            throw new RuntimeException("id invalido");
        }
        String alter = "DELETE FROM servitel_system.marca WHERE id_marca = ?;";
        boolean check = false;

        try {
            java.sql.PreparedStatement stmt2 = con.prepareStatement(alter);
            stmt2.setInt(1, id);
            if (!stmt2.execute()) {
                this.mensagem = "Marca do Produdo excluida Com Sucesso!";
                System.out.println(minhaConexao.getMsg());
                check = true;

            } else {
                System.out.println(minhaConexao.getMsg());
                this.mensagem = "Erro ao excluir marca do Produto!\n A marca nao existe ou foi informado dados invalidos para alteração";
                check = false;
            }
            stmt2.close();
        } catch (SQLException e) {
            e.getErrorCode();
        } finally {
            minhaConexao.fecharConexao();
        }
        return check;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
