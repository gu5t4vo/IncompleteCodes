package assembler.initScreen.btns;

import assembler.GUI;
import assembler.export_bets.ExportScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExportBets extends DefBtn implements ActionListener {

    public ExportBets() {
        super();
        setText("EXPORT BETS");
        addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.getInitScreen().setVisible(false);
        GUI.getExportScreen().setVisible(true);
    }
}
