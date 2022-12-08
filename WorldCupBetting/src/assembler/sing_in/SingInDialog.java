package assembler.sing_in;

import javax.swing.*;
import java.awt.*;

public class SingInDialog extends JDialog {

    protected SingIn    singIn;
    protected OptMenu   optMenu;

    public SingInDialog() {
        setLayout(new GridLayout(2, 1));
        setSize(300, 110);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setTitle("Sing In");

        singIn  = new SingIn();
        optMenu = new OptMenu(this);

        add(singIn);
        add(optMenu);

        setVisible(true);
    }

    public OptMenu getOptMenu() {
        return optMenu;
    }
}
