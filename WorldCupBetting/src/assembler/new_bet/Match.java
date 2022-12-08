package assembler.new_bet;

import assembler.Txt;

import javax.swing.*;
import java.awt.*;

public class Match extends JPanel {

    protected TeamSelector team1;
    protected TeamSelector team2;

    public Match() {
        setLayout(new GridLayout(1, 3));

        team1 = new TeamSelector(1);
        team2 = new TeamSelector(2);

        add(team1);
        add(Txt.formattedJLabel("X", "arial", 35, 100));
        add(team2);

    }

    public void reset(){
        team1.reset();
        team2.reset();
    }

}
