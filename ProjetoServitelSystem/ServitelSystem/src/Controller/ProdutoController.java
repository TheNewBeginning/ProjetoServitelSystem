/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ADO.ProdutoAdo;
import Model.ProdutoModel;
import java.util.List;
import objectTransferData.ObjectData;

/**
 *
 * @author joreel
 */
public class ProdutoController {

    public boolean salvar(ProdutoModel produto) {
        ProdutoAdo produtoAdo = new ProdutoAdo();
        boolean check = false;
        try {
            if (produtoAdo.salvar(produto)) {
                ObjectData.SendToMsg(produtoAdo.getMensagem());
                check = true;
            } else {
                System.out.println("tentaou");
                ObjectData.SendToMsg(produtoAdo.getMensagem());
                check = false;
            }
        } catch (RuntimeException e) {
                ObjectData.SendToMsg("ERRO AO INSERIR PRODUTO:");
        }
        return check;
    }

    public List<ProdutoModel> Consulta() {
        ProdutoAdo produtoAdo = new ProdutoAdo();
        /**
         * if (produtoAdo.ConsultaTodos().isEmpty()) { ObjectData.SendToMsg("Não
         * existe nenhuma produto cadastrada."); return null; }
         */
        return produtoAdo.ConsultaTodos();

    }

    public boolean alterar(ProdutoModel produto) {
        ProdutoAdo produtoAdo = new ProdutoAdo();
        System.out.println("Controller:" + produto);
        if (produtoAdo.alterar(produto)) {
            ObjectData.SendToMsg(produtoAdo.getMensagem());
            return true;
        } else {
            ObjectData.SendToMsg(produtoAdo.getMensagem());
            return false;
        }
    }

    public boolean excluir(ProdutoModel produto) {
        ProdutoAdo produtoAdo = new ProdutoAdo();
        if (produtoAdo.excluir(produto.getIdProd())) {
            ObjectData.SendToMsg(produtoAdo.getMensagem());
            return true;
        } else {
            ObjectData.SendToMsg(produtoAdo.getMensagem());
            return false;
        }
    }
}
