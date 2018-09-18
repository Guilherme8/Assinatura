/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import controle.ControleDados;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.TamanhoFixo;

/**
 *
 * @author lsantoro
 */
public class TelaDados extends javax.swing.JFrame {

    /**
     * Creates new form TelaDados
     */
    public TelaDados() {
        initComponents();
        definirTamanhos();
        this.setLocationRelativeTo(null);
    }
    
    public void definirTamanhos() {
        jTextFieldNome.setDocument(new TamanhoFixo(25));
        jTextFieldFuncao.setDocument(new TamanhoFixo(30));
        jTextFieldSecao.setDocument(new TamanhoFixo(30));
        jTextFieldEmail.setDocument(new TamanhoFixo(45));
        jTextFieldInfo1.setDocument(new TamanhoFixo(45));
        jTextFieldInfo2.setDocument(new TamanhoFixo(45));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFuncao = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldInfo1 = new javax.swing.JTextField();
        jTextFieldInfo2 = new javax.swing.JTextField();
        jFormattedTextFieldTel = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSecao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assinatura");

        jLabel7.setText("Função:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 ## ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Insira os dados:");

        jLabel6.setText("Info 2:");

        jLabel5.setText("Info 1:");

        jLabel4.setText("Telefone:");

        jLabel3.setText("E-mail:");

        jLabel2.setText("Nome:");

        jLabel8.setText("Seção:");

        jTextFieldSecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(jTextFieldEmail))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSecao)
                                    .addComponent(jTextFieldFuncao)))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextFieldTel))
                            .addGroup(jPanelDadosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)
                                .addComponent(jTextFieldInfo1))))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldInfo2)))
                .addContainerGap())
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalvar)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSecaoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        try {
            String nome = jTextFieldNome.getText();
            String funcao = jTextFieldFuncao.getText();
            String secao = jTextFieldSecao.getText();
            String email = jTextFieldEmail.getText();
            String telefone = jFormattedTextFieldTel.getText();
            String info1 = jTextFieldInfo1.getText();
            String info2 = jTextFieldInfo2.getText();

            contDados.criarNovo();

            contDados.atribuirDados(nome, funcao, secao, email, telefone, info1, info2);

            if (contDados.imprimir()) {
                JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFuncao;
    private javax.swing.JTextField jTextFieldInfo1;
    private javax.swing.JTextField jTextFieldInfo2;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSecao;
    // End of variables declaration//GEN-END:variables
    private ControleDados contDados = new ControleDados();

    private void limparCampos() {
        Component[] components = jPanelDados.getComponents();
        JTextField textfield = null;
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JTextField) {
                textfield = (JTextField) components[i];
                textfield.setText("");
            }
        }
        jTextFieldNome.grabFocus();
    }
}