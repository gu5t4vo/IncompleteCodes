package assembler.sing_in;

import javax.swing.*;
import java.awt.*;

public class SingIn extends JPanel {

    protected static JTextField jTextField;
    protected static String     userName;

    public SingIn() {
        setLayout(new FlowLayout());

        jTextField = new JTextField(10);

        add(new JLabel("Your Name: "));
        add(jTextField);

    }

    public static JTextField getJTextField() {
        return jTextField;
    }
}
