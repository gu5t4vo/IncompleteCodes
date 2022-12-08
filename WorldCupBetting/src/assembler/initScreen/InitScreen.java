package assembler.initScreen;

import assembler.GUI;
import assembler.Txt;
import assembler.sing_in.SingIn;

import javax.swing.*;
import java.awt.*;

public class InitScreen extends JPanel {

    private static  JLabel      title;
    private final   InitMenu    initMenu;

    public InitScreen() {
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);

        initMenu = new InitMenu();

        title = Txt.formattedJLabel("", "georgia", 15, 50);

        add(title, BorderLayout.NORTH);

        add(initMenu, BorderLayout.CENTER);
    }

    public static JLabel getTitle() {
        return title;
    }

    public InitMenu getInitMenu() {
        return initMenu;
    }
}
