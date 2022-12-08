package assembler.initScreen.btns;

import javax.swing.*;
import java.awt.*;

public abstract class DefBtn extends JButton {
    public DefBtn() {
        setSize(new Dimension(130, 30));
        setMaximumSize(getSize());
    }
}
