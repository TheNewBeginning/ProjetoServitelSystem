/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitelsystem;

import Controller.MarcaController;
import Controller.ProdutoController;
import Controller.TabelController;
import Model.MarcaModel;
import Model.ProdutoModel;
import java.util.ArrayList;
import defaultTable.GenericComboModel;
import defaultTable.ListaDeDadosTabela;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import objectTransferData.ObjectData;

/**
 *
 * @author marcos
 */
public class CadastroProdutos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos() {
        initComponents();
        consultaTodasMarcas();
        //ComboMarca.addItem("Item");

    }
    private List<MarcaModel> marcas = new ArrayList<>();

    private void consultaTodasMarcas() {
        MarcaController marca = new MarcaController();
        marcas = marca.Consulta();
        comboBoxMarca.setModel(new GenericComboModel(marcas));
        System.out.println(Arrays.toString(marcas.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTNomeProduto = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jComboBoxMedida = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTFEstoqueAtual1 = new javax.swing.JTextField();
        jExcluir = new javax.swing.JButton();
        comboBoxMarca = new javax.swing.JComboBox<>();
        jPanelPesquisar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpStateChanged(evt);
            }
        });

        jPanelInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null), "Dados de Produtos"));

        jLabel3.setText("Nome Produto:");

        jLabel6.setText("Unidade Medida:");

        jLabel7.setText("Marca:");

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jComboBoxMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Item", "KG", "Metro" }));
        jComboBoxMedida.setToolTipText("Selecione uma unidade de medida");
        jComboBoxMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedidaActionPerformed(evt);
            }
        });

        jLabel8.setText("Estoque Atual:");

        jExcluir.setText("Excluir");
        jExcluir.setEnabled(false);
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        comboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona um Item" }));
        comboBoxMarca.setToolTipText("Selecione uma Marca");
        comboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMarcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInicioLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelInicioLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelInicioLayout.createSequentialGroup()
                            .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFEstoqueAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 456, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jExcluir))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFEstoqueAtual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBLimpar)
                    .addComponent(jExcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tp.addTab("Manter Produtos", jPanelInicio);

        jPanelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "marca", "nome", "Unidade Medida", "Estoque Atual"
            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        tp.addTab("Pesquisar", jPanelPesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMedidaActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpaDados();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void limpaDados() {
        jTNomeProduto.setText("");
        jTFEstoqueAtual1.setText("");
        GenericComboModel g = new GenericComboModel();
        g.setSelectedItem("teste");
        comboBoxMarca.setSelectedIndex(0);
        comboBoxMarca.setModel(new GenericComboModel(marcas));
        jComboBoxMedida.setSelectedIndex(0);
        //jComboBoxMedida.setSelectedItem("Selecione um Item");
    }
    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        ProdutoModel produtoModel = null;
        ProdutoController produto = new ProdutoController();
        TabelController consultaTabel = new TabelController();
        if (this.id <= 0) {
            /*Verificar se o JInputText está livre, e se estiver ele Insere o produto, e se vier com algo no Input a
            *a ação do botão muda para Alterar se vier um Id valido obviamente
             */
            if (jTFEstoqueAtual1.getText().equals("")) {
                //Nao faz nada.
            } else {
                try {
                    produtoModel = new ProdutoModel((MarcaModel) comboBoxMarca.getSelectedItem(), jTNomeProduto.getText(), "" + jComboBoxMedida.getSelectedItem(), Integer.parseInt(jTFEstoqueAtual1.getText()));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O Campo Estoque atual só aceita numeros!");
                }

                try {
                    if (produtoModel.checaAtributos()) {
                        //passando o nome do produto para pesquisar se há algum outro já cadastrado no banco.
                        //Passando o nome da tabela onde irá pesquisar a duplicidade do nome.
                        if (!consultaTabel.consultaPorNome(jTNomeProduto.getText(), "produto")) {
                            if (produto.salvar(produtoModel)) {
                                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                                limpaDados();
                            } else {
                                System.out.println("tentouuuuusdfsdfs");
                                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                            }
                        } else {
                            System.out.println("TESTANDO");
                            JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                        }
                    } else {
                        System.out.println("ENTROU 1");
                        JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                    }
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "O Campo de Estoque atual está vazio.\nOu com letras ao inves de numeros, por favor digite somente numeros!");

                }

            }
        } else {
            System.out.println("2 Teste? this.id = " + this.id);

            //passar id do produto
            if (jTFEstoqueAtual1.getText().equals("")) {
                // Nao faz nada.
            } else {
                try {
                    produtoModel = new ProdutoModel(this.id, (MarcaModel) comboBoxMarca.getSelectedItem(), jTNomeProduto.getText(), "" + jComboBoxMedida.getSelectedItem(), Integer.parseInt(jTFEstoqueAtual1.getText()));

                    if (produtoModel.checaAtributos()) {

                        if (!consultaTabel.consultaTodoObjeto(produtoModel, "produto")) {
                            if (produto.salvar(produtoModel)) {
                                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                                limpaDados();
                            } else {
                                System.out.println("tentouuuuusdfsdfs");
                                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "O Campo Estoque atual só aceita numeros!");
                } catch (NullPointerException ex) {

                }

            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void tpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpStateChanged
        if (tp.getSelectedIndex() == 1) {
            atualiza();
        }
    }//GEN-LAST:event_tpStateChanged

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        int x = jTableProdutos.getSelectedRow();
        ProdutoModel produto = (ProdutoModel) list.get(x);
        this.id = produto.getIdProd();
        System.out.println("this.id= " + this.id);
        MarcaModel marca = produto.getMarca();
        System.out.println("marca: " + marca.getNomeMarca());

        comboBoxMarca.getModel().setSelectedItem(produto.getMarca());

        System.out.println("get Combo:" + comboBoxMarca.getSelectedItem());

        jTNomeProduto.setText(produto.getNomeProduto().trim());
        jComboBoxMedida.setSelectedItem(produto.getUnidadeMedida().trim());
        System.out.println("get Media:" + jComboBoxMedida.getSelectedItem());

        jTFEstoqueAtual1.setText("" + produto.getEstoqueAtual());
        System.out.println("Dados: " + produto.toString());
        tp.setSelectedComponent(jPanelInicio);
        jExcluir.setEnabled(true);

    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void comboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMarcaActionPerformed
    }//GEN-LAST:event_comboBoxMarcaActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        ProdutoModel produtoModel = new ProdutoModel(this.id, (MarcaModel) comboBoxMarca.getSelectedItem(), jTNomeProduto.getText(), "" + jComboBoxMedida.getSelectedItem(), Integer.parseInt(jTFEstoqueAtual1.getText()));
        ProdutoController controller = new ProdutoController();
        if (produtoModel.checaAtributos()) {
            if (controller.excluir(produtoModel)) {
                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                limpaDados();
            } else {
                JOptionPane.showMessageDialog(null, ObjectData.getMsg());

            }
        }else{
            JOptionPane.showMessageDialog(null,ObjectData.getMsg());
        }
    }//GEN-LAST:event_jExcluirActionPerformed

    private void atualiza() {
        System.out.println("passou no atualiza");
        //MarcaModel model = new MarcaModel();
        ProdutoController controller = new ProdutoController();
        list = new ListaDeDadosTabela((List<Object>) (Object) controller.Consulta(), 5);
        jTableProdutos.setModel(list);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableProdutos.revalidate();
        jTableProdutos.repaint();
        list.fireTableDataChanged();
        if (controller.Consulta().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não tem nenhuma marca Registrada!.");
        }

    }

    ListaDeDadosTabela list;
    private int id = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxMarca;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jComboBoxMedida;
    private javax.swing.JButton jExcluir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFEstoqueAtual1;
    private javax.swing.JTextField jTNomeProduto;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
}
