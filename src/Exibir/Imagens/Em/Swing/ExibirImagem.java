/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exibir.Imagens.Em.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author flavio-silva
 */
public class ExibirImagem extends javax.swing.JDialog {

    /**
     * Creates new form ExibirImagem
     */
    
    private CarregaImagemV2 ci;
    
    
    public ExibirImagem(java.awt.Frame parent, boolean modal, String imagem ) {
        
        super(parent, modal);
        ci = (CarregaImagemV2) parent;
        this.setTitle("Teste ExibirImagem");
        
        //container onde serão adicionados todos componentes  
        Container container = this.getContentPane();  
  
        //carrega a imagem passando o nome dela  
        ImageIcon img = new ImageIcon( imagem );  
                
        //pega a altura e largura  
        int altura = img.getIconHeight();  
        int largura = img.getIconWidth();  
          
        //adiciona a imagem em um label  
        JLabel label = new JLabel(img);  
        //adiciona a altura e largura em outro label  
        JLabel label2 = new JLabel("Altura: "+altura+"      Largura: "+largura);  
  
        //cria o JPanel para adicionar os labels  
        JPanel panel = new JPanel();  
        panel.add(label, BorderLayout.NORTH);  
        //panel.add(label2, BorderLayout.SOUTH);  
  
        //adiciona o panel no container  
        container.add(panel, BorderLayout.CENTER);  
          
        this.pack();  
  
        //pronto e simples  
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

        jButton1 = new javax.swing.JButton();

        jButton1.setText("Voltar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}