package assembler.initScreen.btns;

import assembler.GUI;
import assembler.sing_in.SingInDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeUser extends DefBtn implements ActionListener {
    public ChangeUser() {
        super();
        setText("CHANGE USER");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.getSingInDialogInstance();
    }
}
