package ADO;

import Model.MarcaModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.ProdutoModel;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoAdo {

    private ConexaoAdo minhaConexao;
    private String mensagem;

    public ProdutoAdo() {
        try {
            minhaConexao = new ConexaoAdo();
        } catch (Exception e) {
            Logger.getLogger(ProdutoAdo.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public boolean salvar(ProdutoModel produto) {
        String query = "INSERT INTO servitel_system.produto"
                + "(marca_id, nome_produto, unidade_medida, estoque_atual) VALUES (?, ?, ?, ?);";
        boolean check = false;
        if (produto.getIdProd() != 0) {
            System.out.println("entrou nesse if");
            alterar(produto);
        } else {
            try {

                try (java.sql.PreparedStatement stmt = this.minhaConexao.getConexao().prepareStatement(query)) {
                    stmt.setInt(1, produto.getMarca().getIdMarca());
                    stmt.setString(2, produto.getNomeProduto().trim());
                    stmt.setString(3, produto.getUnidadeMedida().trim());
                    stmt.setInt(4, produto.getEstoqueAtual());
                    if (!stmt.execute()) {
                        this.mensagem = "Produdo inserido Com Sucesso!";
                        check = true;

                    } else {
                        check = false;
                        this.mensagem = "Erro ao Inserir o produto!";
                    }
                    //System.out.println(stmt);
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                this.mensagem = " Catch: Erro ao Inserir o produto!";
                throw new RuntimeException(e);
            } finally {
                minhaConexao.fecharConexao();
            }
        }
        return check;
    }

    public List<ProdutoModel> ConsultaTodos() {
        String query = "SELECT id_produto,marca_id,servitel_system.marca.nome_marca,"
                + "nome_produto, "
                + "unidade_medida, estoque_atual FROM "
                + "servitel_system.produto inner join servitel_system.marca on marca.id_marca = marca_id;";
        ProdutoModel produtoModel = null;
        List<ProdutoModel> produtoLista = new ArrayList<>();
        try {
            try (java.sql.PreparedStatement stmt = this.minhaConexao.getConexao().prepareStatement(query)) {
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    produtoModel = new ProdutoModel();
                    MarcaModel marca = new MarcaModel();
                    produtoModel.setIdProd(rs.getInt(1)); //1

                    System.out.println("Id do Produto:" + produtoModel.getIdProd());
                    //Instancia dados de marcas;
                    marca.setIdMarca(rs.getInt("marca_id")); //2
                    marca.setNomeMarca(rs.getString("nome_marca"));
                    System.out.println("id da Marca:" + marca.getIdMarca() + "nome Marca:" + marca.getNomeMarca());
                    produtoModel.setMarca(marca); // 2 junto
                    //
                    produtoModel.setNomeProduto(rs.getString("nome_produto")); //3
                    System.out.println("nome do Produto:" + produtoModel.getNomeProduto());
                    produtoModel.setUnidadeMedida(rs.getString("unidade_medida")); //4
                    produtoModel.setEstoqueAtual(rs.getInt(6));
                    produtoLista.add(produtoModel);

                }
            }
        } catch (SQLException ex) {
            ex.getStackTrace();
            throw new RuntimeException(ex);
        }
        return produtoLista;
    }

    public boolean alterar(ProdutoModel produto) {
        String alter = "UPDATE servitel_system.produto SET marca_id=?, nome_produto=?, unidade_medida=?, estoque_atual=? WHERE id_produto=?;";
        boolean check;

        try {
            java.sql.PreparedStatement stmt2 = this.minhaConexao.getConexao().prepareStatement(alter);
            stmt2.setInt(1, produto.getMarca().getIdMarca());
            stmt2.setString(2, produto.getNomeProduto());
            stmt2.setString(3, produto.getUnidadeMedida().trim());
            stmt2.setInt(4, produto.getEstoqueAtual());
            stmt2.setInt(5, produto.getIdProd());
            if (stmt2.executeUpdate() != 0) {
                this.mensagem = "Dados do Produdo alterada Com Sucesso!";
                System.out.println(minhaConexao.getMsg());
                check = true;

            } else {
                System.out.println(minhaConexao.getMsg());
                this.mensagem = "Erro ao alterar Produto!\n A produto nao existe ou foi informado dados invalidos para alteração";
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

    public boolean excluir(int id) {
        String alter = "DELETE FROM servitel_system.produto WHERE id_produto = ?;";
        boolean check;

        try {
            java.sql.PreparedStatement stmt2 = this.minhaConexao.getConexao().prepareStatement(alter);
            stmt2.setInt(1, id);
            if (!stmt2.execute()) {
                this.mensagem = "Produdo excluida Com Sucesso!";
                System.out.println(minhaConexao.getMsg());
                check = true;

            } else {
                System.out.println(minhaConexao.getMsg());
                this.mensagem = "Erro ao excluir o produto!\n A produto nao existe ou foi informado dados invalidos para alteração";
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
