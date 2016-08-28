package Exibir.Imagens.Em.Swing;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

public class Teste {

    public static void main(String args[]) {

        //janela do programa      
        JFrame frame = new JFrame("Carregar Imagem");
        //container onde serão adicionados todos componentes  
        Container container = frame.getContentPane();

        //carrega a imagem passando o nome da mesma  
        try {

            ImageIcon img = new ImageIcon("/home/flavio-silva/1.BackupDadosIn2012-02-12/1.jpg");  
            //ImageIcon img = new ImageIcon("http://flavio-silva:fl6396@image.tmdb.org/t/p/w185/9gm3lL8JMTTmc3W4BmNMCuRLdL8.jpg");

            //pega a altura e largura  
            int altura = img.getIconHeight();
            int largura = img.getIconWidth();

            //adiciona a imagem em um label  
            JLabel label = new JLabel(img);
            //adiciona a altura e largura em outro label  
            JLabel label2 = new JLabel("Altura: " + altura + "      Largura: " + largura);

            //cria o JPanel para adicionar os labels  
            JPanel panel = new JPanel();
            panel.add(label, BorderLayout.NORTH);
            panel.add(label2, BorderLayout.SOUTH);

            //adiciona o panel no container  
            container.add(panel, BorderLayout.CENTER);

            frame.pack();
            frame.setVisible(true);

        } catch (Exception e) {
            System.out.println("Erro : " + e.getMessage());
        }
    }
}
