package assembler.export_bets;

import assembler.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackBtn extends JButton implements ActionListener {
    public BackBtn() {
        setText("<");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.getInitScreen().setVisible(true);
        GUI.getExportScreen().setVisible(false);
    }
}
