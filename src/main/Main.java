package main;

import javax.swing.*;


public class Main {
    private JButton btnpreciona;
    private JPanel panel1;


    public Main() {
        btnpreciona.addActionListener(e-> {
            String nombre = JOptionPane.showInputDialog(null,"ingresa tu nombre");
          JOptionPane.showMessageDialog(null,"Hola " + nombre);

        });


    }
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Main");
        jFrame.setContentPane(new Main().panel1);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
