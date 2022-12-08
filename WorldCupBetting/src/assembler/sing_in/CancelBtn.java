package assembler.sing_in;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelBtn extends JButton implements ActionListener {

    protected JDialog jDialog;

    public CancelBtn(JDialog jDialog) {

        this.jDialog = jDialog;
        setText("CANCEL");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jDialog.dispose();
    }
}
