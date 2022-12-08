package assembler.new_bet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class RoundOf extends JPanel implements ItemListener{

    private final ArrayList<Match> matches;

    public RoundOf(int rounds){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        matches = new ArrayList<>();

        JPanel backZone = new JPanel();
        backZone.setLayout(new FlowLayout(FlowLayout.LEFT));
        backZone.add(new BackBtn(this));

        add(backZone);

        for (int i = 0; i < rounds; i++){
            matches.add(new Match());
            add(Box.createRigidArea(new Dimension(0, 10)));
            add(matches.get(i));
            matches.get(i).team1.teamsComboBox.addItemListener(this);
            matches.get(i).team2.teamsComboBox.addItemListener(this);
        }

        JPanel nextZone = new JPanel();
        nextZone.setLayout(new FlowLayout(FlowLayout.RIGHT));
        nextZone.add(new NextBtn());
        add(nextZone);
    }

    public void reset(){
        for (Match match: matches) {
            match.reset();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        for (Match match: matches) {

            match.team1.itemStateChanged(e);
            match.team2.itemStateChanged(e);

            try {
                if (match.team1.selectedTeam.equals(match.team2.selectedTeam)) {
                    match.team1.setBackground(Color.RED);
                    match.team2.setBackground(Color.RED);
                } else {
                    match.team1.setBackground(Color.WHITE);
                    match.team2.setBackground(Color.WHITE);
                }
            } catch (NullPointerException ignored){

            }
        }
    }
}
