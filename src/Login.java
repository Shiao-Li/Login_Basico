import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{


    private JPanel login;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton ingresarButton;
    private JButton salirButton;

    public Login() {
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = textField1. getText();
                String contraseña = passwordField1.getText();


                if (usuario.isEmpty() || contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos");
                }else {
                    if (usuario.equals("shiao22") || usuario.equals("roberto.shiao@epn.edu.ec") && contraseña.equals("shiao123")) {

                        JFrame frame2 = new JFrame("Perfil 1"); //Creaccion de un objeto que nos ayudara a utilizar las instancias del formulario 2
                        perfil_usurario_RS f1 = new perfil_usurario_RS();

                        f1.setDato(textField1.getText());

                        frame2.setSize(200, 200);
                        frame2.setContentPane(f1.perfil1);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.pack();
                        frame2.setLocationRelativeTo(null);
                        frame2.setVisible(true);
                        dispose();

                    } else if (usuario.equals("erick.santillan@epn.edu.ec") || usuario.equals("erick12") && contraseña.equals("erick123")) {
                        JFrame frame2 = new JFrame("Perfil 2"); //Creaccion de un objeto que nos ayudara a utilizar las instancias del formulario 2
                        perfil_usuario_ES f2 = new perfil_usuario_ES();

                        f2.setDato(textField1.getText());

                        frame2.setSize(500, 500);
                        frame2.setContentPane(f2.perfil2);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.pack();
                        frame2.setLocationRelativeTo(null);
                        frame2.setVisible(true);
                        //dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto");
                    }
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] arg) {
        JFrame frame1 = new JFrame("Inicia sesión");
        Login f1 = new Login();

        frame1.setContentPane(f1.login);
        frame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame1.pack();
        frame1.setSize(400, 400);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
    }
}
