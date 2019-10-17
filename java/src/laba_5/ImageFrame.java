package laba_5;
import javax.swing.*;
class ImageFrame extends JFrame
{
    public static int DEFAULT_WIDTH = 700;
    public static int DEFAULT_HEIGHT = 700;
    public ImageFrame()
    {
        setTitle("ImageTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Добавление компонента к фрейму.

        ImageComponent component = new ImageComponent();
        add(component);
    }
}
