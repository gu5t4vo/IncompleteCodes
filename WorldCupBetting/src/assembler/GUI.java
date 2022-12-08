package assembler;

import assembler.export_bets.ExportScreen;
import assembler.initScreen.InitScreen;
import assembler.new_bet.RoundOf;
import assembler.sing_in.SingInDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    protected static CardLayout cardLayout;
    private static SingInDialog singInDialog;
    private static ExportScreen exportScreen;

    private static InitScreen initScreen;
    private static RoundOf roundOf8;
    private static RoundOf roundOf4;
    private static RoundOf finalMatch;

    public GUI() {
        setSize(700, 600);
        cardLayout = new CardLayout();
        setLayout(cardLayout);

        initScreen = new InitScreen();

        exportScreen = new ExportScreen();
        exportScreen.setName("Export Screen");

        roundOf8    = new RoundOf(4);
        roundOf4    = new RoundOf(2);
        finalMatch  = new RoundOf(1);

        setTitle("Sing In");

        singInDialog = new SingInDialog();
        singInDialog.getOptMenu().getConfirmBtn().addActionListener(this);

        add(initScreen);
        add(exportScreen);
        add(roundOf8);
        add(roundOf4);
        add(finalMatch);

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static ExportScreen getExportScreen() {
        return exportScreen;
    }

    public static InitScreen getInitScreen() {
        return initScreen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(true);
        singInDialog.getOptMenu().getConfirmBtn().actionPerformed(e);
    }

    public static RoundOf getRoundOf8() {
        return roundOf8;
    }

    public static void getSingInDialogInstance() {

        singInDialog = new SingInDialog();

    }

    public static void reset(){
        roundOf8.reset();
        roundOf4.reset();
        finalMatch.reset();
    }
}
