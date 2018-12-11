/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;
import objectTransferData.ObjectData;

public class ProdutoModel {

    private int idProd;
    private MarcaModel marca;
    private String nomeProduto;
    private String unidadeMedida;
    private int estoqueAtual;

    public ProdutoModel() {

    }

    public ProdutoModel(MarcaModel marca, String nomeProduto, String unidadeMedida, int estoqueAtual) {
        this.marca = marca;
        this.nomeProduto = nomeProduto.trim();
        this.unidadeMedida = unidadeMedida.trim();
        this.estoqueAtual = estoqueAtual;
    }

    public ProdutoModel(int idProd, MarcaModel marca, String nomeProduto, String unidadeMedida, int estoqueAtual) {
        this.idProd = idProd;
        this.marca = marca;
        this.nomeProduto = nomeProduto.trim();
        this.unidadeMedida = unidadeMedida.trim();
        this.estoqueAtual = estoqueAtual;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public MarcaModel getMarca() {
        return marca;
    }

    public void setMarca(MarcaModel marca) {
        this.marca = marca;
    }

    public String getNomeProduto() {
        return nomeProduto.trim();
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto.trim();
    }

    public String getUnidadeMedida() {
        return unidadeMedida.trim();
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida.trim();
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public boolean checaAtributos() throws NullPointerException {
        boolean check = true;
        try {
            check = marca.checaAtributos();
        } catch (NullPointerException e) {
            ObjectData.SendToMsg("A marca do produto nao pode ficar vazia");
        }

        if (this.nomeProduto.trim().equals("")) {
            ObjectData.SendToMsg("nome do produto está vazio preencha por favor!");
            check = false;
        }

        if (this.unidadeMedida.trim().equals("") || this.unidadeMedida.trim().equals("Selecione um Item")) {
            ObjectData.SendToMsg("você nao selecionou nenhuma Unidade de medida");
            check = false;
        }

        if (this.estoqueAtual == 0 || this.estoqueAtual <= 0) {
            check = false;

        }

        return check;
        //return marca.checaAtributos() || !this.nomeProduto.equals("") || !this.unidadeMedida.equals("") || this.estoqueAtual == 0;
    }

    @Override
    public String toString() {
        return "ProdutoModel{" + " idProduto=" + idProd + ", marca=" + marca + ", nomeProduto=" + nomeProduto + ", unidadeMedida=" + unidadeMedida + ", estoqueAtual=" + estoqueAtual + '}';
    }

}
