package assembler.new_bet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackBtn extends JButton implements ActionListener {

    protected RoundOf roundOf;

    public BackBtn(RoundOf roundOf) {
        this.roundOf = roundOf;
        setText("<");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        roundOf.setVisible(false);
    }
}
