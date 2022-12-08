package assembler.new_bet;

import assembler.Countries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TeamSelector extends JPanel implements ItemListener {

    protected   final TeamsComboBox teamsComboBox;
    protected   final Score         score;
    private     final JLabel flag;
    public Countries selectedTeam;

    public TeamSelector(int index) {
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(15);

        setLayout(borderLayout);

        teamsComboBox = new TeamsComboBox();
        teamsComboBox.addItemListener(this);

        flag = new JLabel();
        flag.setIcon(teamsComboBox.getFlag());

        score = new Score();

        if (index % 2 == 0){
            add(score, BorderLayout.WEST);
        }

        add(teamsComboBox, BorderLayout.NORTH);

        if (index % 2 == 1){
            add(score, BorderLayout.EAST);
        }

        add(flag, BorderLayout.CENTER);

    }

    public JLabel getJLabel() {
        return flag;
    }

    public void reset(){
        teamsComboBox.reset();
        flag.setIcon(teamsComboBox.getFlag());
        score.setText("0");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        teamsComboBox.itemStateChanged(e);

        flag.setIcon(teamsComboBox.getFlag());
        selectedTeam = (Countries) teamsComboBox.getSelectedItem();
    }


}
