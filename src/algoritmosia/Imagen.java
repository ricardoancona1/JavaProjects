package algoritmosia;

import javax.swing.*;
import java.awt.*;

public class Imagen {

    public static ImageIcon getImage() {
        Image image = new ImageIcon("src/algoritmosia/assets/Mapa.png").getImage();
        return new ImageIcon(image.getScaledInstance(350, 250, Image.SCALE_SMOOTH));
    }
}
