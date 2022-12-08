package assembler.export_bets;

import assembler.Txt;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {

    protected BackPanel backPanel;

    public Header() {
        JLabel title = Txt.formattedJLabel("Bets Available", "georgia", 20, 100);
        title.setHorizontalAlignment(SwingConstants.CENTER);

        backPanel = new BackPanel();

        GridLayout gridLayout = new GridLayout(2, 1);

        setLayout(gridLayout);
        add(backPanel);
        add(title);
    }
}
