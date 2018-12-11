/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO;

import Model.ProdutoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import objectTransferData.ObjectData;

/**
 *
 * @author joreel
 */
public class ClasseParaConsultasPorNomeTodasTabela {

    private ConexaoAdo minhaConexao;
    private String mensagem;

    public ClasseParaConsultasPorNomeTodasTabela() {
        try {
            minhaConexao = new ConexaoAdo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A Conexão com o banco de dados nao foi efetuado com sucesso.");
        }
    }

    public boolean consultaPorNome(String nome, String nomeTabela) throws Exception {
        if (nome.equals("")) {
            throw new NullPointerException("nome está vazio");
        }
        String query = "Select nome_produto from servitel_system." + nomeTabela + " where nome_produto = ?;";
        ResultSet rs = null;
        boolean check = false;
        try {
            PreparedStatement stmt = this.minhaConexao.getConexao().prepareStatement(query);
            stmt.setString(1, nome);
            rs = stmt.executeQuery();
            if (rs.next()) {
                this.mensagem = "O nome do " + nomeTabela + "já existe por favor insera outro";
                check = true;

            } else {
                check = false;
            }

            stmt.close();

        } catch (SQLException | RuntimeException ex) {
            ex.printStackTrace();
        } finally {
            minhaConexao.fecharConexao();
        }
        return check;
    }

    public boolean consultaTodoObjeto(ProdutoModel model, String nomeTabela) throws Exception {
        String query = "SELECT id_produto, nome_produto FROM servitel_system." + nomeTabela + " where nome_produto = ?;";
        ResultSet rs = null;
        boolean check = false;
        try {
            PreparedStatement stmt = this.minhaConexao.getConexao().prepareStatement(query);
            stmt.setString(1, model.getNomeProduto());
            rs = stmt.executeQuery();
            System.out.println(stmt);
            if (rs.next()) {
                if (model.getIdProd() == rs.getInt(1)) {
                    System.out.println("ENTROU E ENCONTROU IGUALLLLLL");

                    check = false;

                } else {
                    this.mensagem = "Existe um mesmo Produto Com esse nome, por favor digite outro!.";
                    check = true;
                }

            } else {
                check = true;
            }

            stmt.close();

        } catch (SQLException | RuntimeException ex) {
            ex.printStackTrace();
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
