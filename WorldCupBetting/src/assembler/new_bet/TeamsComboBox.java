package assembler.new_bet;

import assembler.Countries;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class TeamsComboBox extends JComboBox<Countries> implements ItemListener {

    private ImageIcon flag;
    public TeamsComboBox() {

        flag = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Ball.png")));

        Countries[] countries = {Countries.ARGENTINA, Countries.BELGIUM, Countries.BRAZIL, Countries.FRANCE,
                Countries.ENGLAND, Countries.NETHERLANDS, Countries.PORTUGAL, Countries.SPAIN};

        addItem(null);
        for (Countries country: countries) {
            addItem(country);
        }

        addItemListener(this);

    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        Countries selectedCountry = (Countries) getSelectedItem();

        try {
            flag = Objects.requireNonNull(selectedCountry).getFlag();
        } catch (NullPointerException exception){
            flag = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Ball.png")));
        }
    }

    public ImageIcon getFlag() {
        return flag;
    }

    public void reset(){

        setSelectedIndex(0);
        flag = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/Ball.png")));

    }
}
