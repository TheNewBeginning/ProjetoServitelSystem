package defaultTable;

import Model.MarcaModel;
import Model.ProdutoModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ListaDeDadosTabela extends AbstractTableModel {

    public static final int COL_CODIGO = 0;
    public static final int COL_NOME = 1;
    public static final int COL_MARCA = 2;
    public static final int COL_UNID_MEDIDA = 3;
    public static final int COL_ESTOQUE_ATUAL = 4;
    private int count;
    private ProdutoModel prod = null;
    private MarcaModel marca = null;
    private List<Object> listar = new ArrayList();

    public ListaDeDadosTabela(List<Object> l, int count) {
        this.count = count;
        this.listar = l;
    }

    public ListaDeDadosTabela() {

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getRowCount() {
        return listar.size();
    }

    @Override
    public int getColumnCount() {
        if (this.count == 5) {
            return 5;
        } else {
            return 2;
        }
    }

    @Override
    public String getColumnName(int colunas) {
        if (this.count == 5) {

            if (colunas == COL_CODIGO) {
                return "Código";
            }
            if (colunas == COL_MARCA) {
                return "Marca";
            }
            if (colunas == COL_NOME) {
                return "Nome";
            }
            if (colunas == COL_UNID_MEDIDA) {
                return "Unidade Medida";
            }
            if (colunas == COL_ESTOQUE_ATUAL) {
                return "Estoque Atual";
            }

        } else {
            if (colunas == COL_CODIGO) {
                return "Código";
            }
            if (colunas == COL_NOME) {
                return "Nome";
            }
        }

        return "";
    }

    /*
    public void updateMarca(int indice, MarcaModel marca) {
        listar.set(indice, marca);
        fireTableRowsUpdated(indice, indice);
    }

    public void removeMarca(int indiceLinha, MarcaModel marca) {
        listar.remove(marca);
        fireTableRowsDeleted(indiceLinha, indiceLinha);

    }*/
    @Override
    public Object getValueAt(int linhas, int colunas) {
        if (!this.listar.isEmpty()) {
            if (this.count == 5) {
                
                //Envia os dados para a Model de Produto
                this.prod = (ProdutoModel) this.listar.get(linhas);
                if (colunas == COL_CODIGO) {
                    return this.prod.getIdProd();
                }
                if (colunas == COL_MARCA) {
                    return this.prod.getMarca().getNomeMarca()+ " - " +this.prod.getMarca().getIdMarca();
                }
                if (colunas == COL_NOME) {
                    return this.prod.getNomeProduto();
                }
                if (colunas == COL_UNID_MEDIDA) {
                    return this.prod.getUnidadeMedida();
                }
                if (colunas == COL_ESTOQUE_ATUAL) {
                    return this.prod.getEstoqueAtual();
                }
            } else {
                //Envia os dados para a Model de Marca
                this.marca = (MarcaModel) this.listar.get(linhas);
                
                if (colunas == COL_CODIGO) {
                    return this.marca.getIdMarca();
                }
                if (colunas == COL_NOME) {
                    return this.marca.getNomeMarca();
                }
            }
        }
        return " ";
    }

    public Object get(int linhas) {
        Object model = this.listar.get(linhas);
        return model;
    }


}
