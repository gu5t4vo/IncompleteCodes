package assembler.initScreen.btns;

import assembler.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewBet extends DefBtn implements ActionListener {

    public NewBet() {
        super();
        setText("NEW BET");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.getInitScreen().setVisible(false);
        GUI.getRoundOf8().setVisible(true);
        GUI.reset();
    }
}
