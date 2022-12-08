package assembler.export_bets;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ExportScreen extends JPanel {

    private final Header header;
    private final BetsAvailable betsAvailable;

    public ExportScreen() {
        setLayout(new BorderLayout());

        header          = new Header();
        betsAvailable   = new BetsAvailable();

        add(header, BorderLayout.PAGE_START);
        add(betsAvailable, BorderLayout.CENTER);

        paintPanels();
    }

    private void paintPanels(){
        ArrayList<JPanel> jPanels = new ArrayList<>();
        jPanels.add(this);
        jPanels.add(header);
        jPanels.add(betsAvailable);
        jPanels.add(header.backPanel);

        for (JPanel jPanel: jPanels) {
            jPanel.setBackground(Color.GREEN);
        }
    }
}
