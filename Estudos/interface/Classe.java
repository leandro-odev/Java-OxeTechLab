import javax.swing.*;
import java.awt.FlowLayout;

public class Classe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panNome = new JPanel();
        panNome.add(new JLabel("Nome"));
        JTextField txtNome = new JTextField(15);
        panNome.add(txtNome);

        JPanel panEmail = new JPanel();
        panEmail.add(new JLabel("Email"));
        JTextField txtEmail = new JTextField(15);
        panEmail.add(txtEmail);

        frame.setLayout(new FlowLayout());
        frame.setSize(250, 150);
        frame.add(panNome);
        frame.add(panEmail);
        frame.setVisible(true);
    }
}