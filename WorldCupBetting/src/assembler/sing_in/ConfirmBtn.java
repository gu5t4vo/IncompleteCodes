package assembler.sing_in;

import assembler.Txt;
import assembler.initScreen.InitScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmBtn extends JButton implements ActionListener {

    protected JDialog jDialog;

    public ConfirmBtn(JDialog jDialog) {
        this.jDialog = jDialog;

        setText("CONFIRM");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SingIn.userName = SingIn.jTextField.getText();
        InitScreen.getTitle().setText(Txt.formattedTxt("Nice to Meet You, " + SingIn.userName + "!<br>" +
                "Welcome to W.C.B! (World Cup Betting)<br><br>", 120));
        jDialog.dispose();
    }
}
