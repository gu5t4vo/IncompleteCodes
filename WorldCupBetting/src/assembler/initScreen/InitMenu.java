package assembler.initScreen;

import assembler.GUI;
import assembler.initScreen.btns.*;

import javax.swing.*;
import java.awt.*;

public class InitMenu extends JPanel {

    protected   ShowBets        showBets;
    protected   NewBet          newBet;
    protected   ExportBets      exportBets;
    protected   ImportBets      importBets;
    protected   ChangeUser      changeUser;

    public InitMenu() {

        setBackground(Color.GREEN);

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);

        GridLayout gridLayout = new GridLayout(4, 1);
        gridLayout.setVgap(10);
        setLayout(boxLayout);

        showBets    = new ShowBets();
        newBet      = new NewBet();
        exportBets  = new ExportBets();
        importBets  = new ImportBets();
        changeUser  = new ChangeUser();

        showBets    .setAlignmentX(CENTER_ALIGNMENT);
        newBet      .setAlignmentX(CENTER_ALIGNMENT);
        exportBets  .setAlignmentX(CENTER_ALIGNMENT);
        importBets  .setAlignmentX(CENTER_ALIGNMENT);
        changeUser  .setAlignmentX(CENTER_ALIGNMENT);

        add(showBets);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(newBet);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(exportBets);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(importBets);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(changeUser);

    }

    public ShowBets getShowBets() {
        return showBets;
    }

    public NewBet getNewBet() {
        return newBet;
    }

    public ExportBets getExportBets() {
        return exportBets;
    }

    public ImportBets getImportBets() {
        return importBets;
    }
}
