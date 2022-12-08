package assembler.sing_in;

import javax.swing.*;
import java.awt.*;

public class OptMenu extends JPanel {

    protected ConfirmBtn    confirmBtn;
    protected CancelBtn     cancelBtn;

    public OptMenu(JDialog jDialog) {
        setLayout(new FlowLayout());
        confirmBtn  = new ConfirmBtn(jDialog);
        cancelBtn   = new CancelBtn(jDialog);

        add(confirmBtn);
        add(cancelBtn);
    }

    public ConfirmBtn getConfirmBtn() {
        return confirmBtn;
    }
}
