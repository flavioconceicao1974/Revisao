/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exibir.Imagens.Em.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author flavio-silva
 */
public class CarregaImagem extends javax.swing.JFrame {
    
    private ImageIcon img;
    private Container container;
    private JPanel panel;
    private JLabel label;

    /**
     * Creates new form CarregaImagem
     */
    public CarregaImagem() {
        
        
        container = this.getContentPane();  
        img = new ImageIcon("/home/flavio-silva/1.BackupDadosIn2012-02-12/1.jpg");  
        label = new JLabel(img);  
        panel = new JPanel();  
        panel.add(label, BorderLayout.NORTH);  
        container.add(panel, BorderLayout.CENTER);  
        this.pack();  
        
       
        
        
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

        jButton_Sair = new javax.swing.JButton();
        jButton_Guardioes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Teste Exibir Imagem");

        jButton_Sair.setText("Sair");
        jButton_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SairActionPerformed(evt);
            }
        });

        jButton_Guardioes.setText("Guardiões");
        jButton_Guardioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardioesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Sair, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Guardioes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Sair)
                .addGap(38, 38, 38)
                .addComponent(jButton_Guardioes)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_SairActionPerformed

    private void jButton_GuardioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardioesActionPerformed
                
        container = this.getContentPane();  
        img = new ImageIcon("/home/flavio-silva/1.BackupDadosIn2012-02-12/1.jpg");  
        label = new JLabel(img);  
        panel = new JPanel();  
        panel.add(label, BorderLayout.NORTH);  
        container.add(panel, BorderLayout.CENTER);  
        this.pack();  
        this.setVisible(true);  
        
        this.repaint();
    }//GEN-LAST:event_jButton_GuardioesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarregaImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarregaImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarregaImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarregaImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarregaImagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardioes;
    private javax.swing.JButton jButton_Sair;
    // End of variables declaration//GEN-END:variables
}