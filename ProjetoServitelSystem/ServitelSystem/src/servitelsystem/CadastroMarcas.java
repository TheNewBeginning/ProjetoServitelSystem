/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servitelsystem;

import Controller.MarcaController;
import Model.MarcaModel;
import defaultTable.ListaDeDadosTabela;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import objectTransferData.ObjectData;

/**
 *
 * @author marcos
 */
public class CadastroMarcas extends javax.swing.JInternalFrame {

    public CadastroMarcas() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();
        jBSalvar = new javax.swing.JButton();
        jExcluir1 = new javax.swing.JButton();
        jInputText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMarca = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados das Marcas de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setText("Nome:");

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jExcluir1.setText("Excluir");
        jExcluir1.setEnabled(false);
        jExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluir1ActionPerformed(evt);
            }
        });

        jInputText.setEditable(false);
        jInputText.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(714, Short.MAX_VALUE)
                        .addComponent(jInputText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBLimpar)
                .addGap(18, 18, 18)
                .addComponent(jBSalvar)
                .addGap(18, 18, 18)
                .addComponent(jExcluir1)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jInputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpar)
                    .addComponent(jBSalvar)
                    .addComponent(jExcluir1))
                .addContainerGap())
        );

        tp.addTab("Manter Marca", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(765, 482));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Marcas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jTableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Marca"
            }
        ));
        jTableMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMarcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMarca);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        tp.addTab("Pesquisar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMarcaMouseClicked
        int x = jTableMarca.getSelectedRow();
        MarcaModel ob = (MarcaModel) list.get(x);

        System.out.println(ob.toString());
        if (!ob.getNomeMarca().isEmpty()) {

            jTNome.setText(ob.getNomeMarca());
            jInputText.setText("" + ob.getIdMarca());
            tp.setSelectedComponent(jPanel1);
            jExcluir1.setEnabled(true);

        }
    }//GEN-LAST:event_jTableMarcaMouseClicked


    private void tpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpStateChanged
        if (tp.getSelectedIndex() == 1) {
            atualiza();
        }
    }//GEN-LAST:event_tpStateChanged

    private void jExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluir1ActionPerformed
        MarcaModel ob = new MarcaModel(jTNome.getText(), Integer.parseInt(jInputText.getText()));
        MarcaController controller = new MarcaController();
        if (controller.excluir(ob)) {
            JOptionPane.showMessageDialog(null, ObjectData.getMsg());
            jTNome.setText("");
            jInputText.setText("");
        } else {
            JOptionPane.showMessageDialog(null, ObjectData.getMsg());

        }
    }//GEN-LAST:event_jExcluir1ActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        MarcaModel marcaModel = null;
        if (jInputText.getText().isEmpty() || jInputText.getText() == null) {
            /*Verificar se o JInputText está livre, e se estiver ele Insere o produto, e se vier com algo no Input a
            *a ação do botão muda para Alterar se vier um Id valido obviamente
            */
            marcaModel = new MarcaModel(jTNome.getText());
        } else {
            marcaModel = new MarcaModel(jTNome.getText(), Integer.parseInt(jInputText.getText()));
        }
        
        MarcaController marca = new MarcaController();
        if (marcaModel.checaAtributos()) {
            if (!marca.consultaPorNome(jTNome.getText())) {
                if (marca.salvar(marcaModel)) {
                    JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                    jTNome.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, ObjectData.getMsg());
                }
            } else {
                JOptionPane.showMessageDialog(null, ObjectData.getMsg());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nome da marca está vazio! Por favor preencha.");
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("");
        jInputText.setText("");
    }//GEN-LAST:event_jBLimparActionPerformed

    private void atualiza() {
        System.out.println("passou no atualiza");
        //MarcaModel model = new MarcaModel();
        MarcaController controller = new MarcaController();
        list = new ListaDeDadosTabela((List<Object>)(Object)controller.Consulta(),2);
        jTableMarca.setModel(list);
        jTableMarca.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableMarca.revalidate();
        jTableMarca.repaint();
        list.fireTableDataChanged();
        if (controller.Consulta().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não tem nenhuma marca Registrada!.");
        }

    }

    public void ConsultaTodos() {
        MarcaController controller = new MarcaController();
        controller.Consulta();

    }
    ListaDeDadosTabela list;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jExcluir1;
    private javax.swing.JTextField jInputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable jTableMarca;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
}
