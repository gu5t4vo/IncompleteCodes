package assembler.export_bets;

import javax.swing.*;
import java.awt.*;

public class BackPanel extends JPanel {
    public BackPanel() {
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        add(new BackBtn());
    }
}
