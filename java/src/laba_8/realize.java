package laba_8;
import javax.swing.*;
import java.io.*;
public class realize {
    public String s;
    public realize()
        {
            try(FileReader reader = new FileReader("C:\\Users\\Admin\\Desktop\\java\\src\\laba_8\\text.txt")) {
                int c;
                s="";
                while ((c = reader.read()) != -1)s=s+(char)(c);// System.out.print((char) c);
                System.out.print(s);
                JOptionPane.showMessageDialog(null, s);
            }
            catch(IOException ex){ System.out.println(ex.getMessage()); }
        }
}
