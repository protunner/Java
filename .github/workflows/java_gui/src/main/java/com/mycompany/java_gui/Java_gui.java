
package com.mycompany.java_gui;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author unifai
 */
public class Java_gui implements ActionListener {
    private JButton botao ;
        public void bagui(){
        System.out.println("Hello World!");
        JFrame janela = new JFrame("minha janela");
        // Crie um painel
        JPanel painel = new JPanel();
        // Crie um botão
        botao = new JButton("Clique em mim!");
        // Crie um LISTENER para o botão
        botao.addActionListener(this);
        //tamanho do botao
        botao.setPreferredSize(new Dimension(100, 100));
        // posição da janela na tela
        janela.setLocation(1,90);
        // Defina o tamanho da janela
        janela.setSize(800, 600);
        // Encerre o programa quando a janela for fechada
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adicione o botão ao painel
        painel.add(botao);
        // Adicione o painel à janela
        janela.add(painel);
        //alinhar o botao a esquerda
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        janela.getContentPane().setLayout(flowLayout);
        // Torne a janela visível
        janela.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent evento) {
        //exibe a messagebox com o falando que clicou no botao
     JOptionPane.showMessageDialog(null, "Você clicou no botão!");
     //altera propriedades da fonte referente ao botao
     botao.setFont(new Font("SansSerif", Font.BOLD, 40));
    }
    public static void main(String[] args) {
        Java_gui listen = new Java_gui();
        listen.bagui();
   }
}
