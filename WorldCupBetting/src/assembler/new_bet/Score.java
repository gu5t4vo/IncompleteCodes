package assembler.new_bet;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;

public class Score extends JFormattedTextField {
    public Score() {
        setColumns(2);
        setHorizontalAlignment(CENTER);
        setAlignmentY(CENTER);
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);

        setFormatter(formatter);

        setFont(new Font("arial", Font.BOLD, 35));
    }


}
