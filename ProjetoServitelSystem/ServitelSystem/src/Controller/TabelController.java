/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ADO.ClasseParaConsultasPorNomeTodasTabela;
import Model.ProdutoModel;
import objectTransferData.ObjectData;

/**
 * Essa classe fica por conta de somente pesquisar nomes no banco de dados para
 * nao replicar nenhum produto, marca entre outros.. items.
 *
 * @author joreel
 */
public class TabelController {

    /**
     *
     * @param nome: Esse parametro ele irá verificar se há um igual a ele no
     * banco de dados por exemplo nome da marca ou nome do produto.. e se tiver
     * ele joga um msg na tela para o usuario
     * @param nomeTabela: temos que passar o nome para qual tabela iremos
     * pesquisar se há dados iguais para que nao tenha erros e esse codigo
     * possar ser utilizado em varias classes.
     * @return
     */
    public boolean consultaPorNome(String nome, String nomeTabela) {
        ClasseParaConsultasPorNomeTodasTabela consulta = new ClasseParaConsultasPorNomeTodasTabela();
        boolean check = false;
        try {
            if (consulta.consultaPorNome(nome, nomeTabela)) {
                ObjectData.SendToMsg(consulta.getMensagem());
                check = true;
            } else {
                ObjectData.SendToMsg(consulta.getMensagem());
                check = false;
            }
        } catch (Exception ex) {
            ObjectData.SendToMsg(ex.getMessage());
        }

        return check;
    }

    public boolean consultaTodoObjeto(ProdutoModel model, String nomeTabela) {
        ClasseParaConsultasPorNomeTodasTabela consulta = new ClasseParaConsultasPorNomeTodasTabela();
        boolean check = false;
        try {
            if (consulta.consultaTodoObjeto(model, nomeTabela)) {
                ObjectData.SendToMsg(consulta.getMensagem());
                check = true;
            } else {
                ObjectData.SendToMsg(consulta.getMensagem());
                check = false;
            }
        } catch (Exception ex) {
            ObjectData.SendToMsg(ex.getMessage());
        }

        return check;
    }
    
    
}
