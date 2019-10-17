package laba_5;
import javax.swing.*;
import java.util.Scanner;
public class realize {
    public static String str;
    public realize()
    {
        Scanner cout=new Scanner(System.in);
        str=cout.nextLine();
        ImageFrame frame = new ImageFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
