package IMC;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class IG {
    private JLabel peso;
    private JPanel p1;
    private JTextField textField2;
    private JButton calcularButton;
    private JLabel Altura;
    private JTextField textField1;
    private JLabel r1;


    public IG() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String altura = textField2.getText(), peso1 = textField1.getText();
                double p = Double.parseDouble(peso1);
                double h = Double.parseDouble(altura);
                double respuesta = p/(h*h);
                JOptionPane.showMessageDialog(null,"Su IMC es: "+respuesta);
            }
        });
    }

    public static void main(String[] arg) {
        JFrame frame1 = new JFrame("IG");
        frame1.setContentPane(new IG().p1);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.pack();
        frame1.setSize(300, 300);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
