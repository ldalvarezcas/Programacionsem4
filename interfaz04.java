/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz04;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Laura Alvarez C
 */
public class interfaz04 {
    public static void main(String[] args) {
JFrame frame = new JFrame("Demo application");
frame.setSize(300, 150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 JPanel panel = new JPanel();
frame.add(panel);
placeComponents(panel);

 frame.setVisible(true);
}

 private static void placeComponents(JPanel panel) {

 panel.setLayout(null);

 JLabel userLabel = new JLabel("Usuario");
userLabel.setBounds(10, 10, 80, 25);
panel.add(userLabel);

 JTextField userText = new JTextField(20);
userText.setBounds(100, 10, 160, 25);
panel.add(userText);

 JLabel passwordLabel = new JLabel("contraseña");
passwordLabel.setBounds(10, 40, 80, 25);
panel.add(passwordLabel);

 JPasswordField passwordText = new JPasswordField(20);
passwordText.setBounds(100, 40, 160, 25);
panel.add(passwordText);

 JButton loginButton = new JButton("login");
loginButton.setBounds(10, 80, 80, 25);
panel.add(loginButton);
JButton registerButton = new JButton("registrar");
registerButton.setBounds(180, 80, 80, 25);
panel.add(registerButton);
}

}
