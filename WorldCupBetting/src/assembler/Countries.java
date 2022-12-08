package assembler;

import javax.swing.*;
import java.util.Objects;

public enum Countries {
    BRAZIL(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/BrazilFlag.jpg"))),
            "Brazil"),
    NETHERLANDS(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/NetherlandsFlag.png"))),
            "Netherlands"),
    ARGENTINA(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/ArgentinaFlag.png"))),
            "Argentina"),
    ENGLAND(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/EnglandFlag.png"))),
            "England"),
    FRANCE(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/FranceFlag.png"))),
            "France"),
    PORTUGAL(new ImageIcon
            (Objects.requireNonNull(Countries.class.getResource("/images/PortugalFlag.png"))),
            "Portugal"),
    BELGIUM(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/images/BelgiumFlag.png"))),
            "Belgium"),
    SPAIN(new ImageIcon(Objects.requireNonNull(Countries.class.getResource("/images/SpainFlag.png"))),
            "Spain");

    final ImageIcon flag;
    final String name;

    Countries(ImageIcon flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public ImageIcon getFlag() {
        return flag;
    }

    public String toString() {
        return name;
    }
}
