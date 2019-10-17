package laba_5;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
class ImageComponent extends JComponent {
    private Image image;
    public ImageComponent() {
        try {
            image = ImageIO.read(new File(realize.str));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g) {
        if (image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
        g.drawImage(image, 0, 0, null);
    }
}
