package laba_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class realize extends JFrame {
    public realize(){
        JPanel[] panel=new JPanel[5];
        for(int i=0;i<5;i++){
            panel[i]=new JPanel();
        }
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation ( DISPOSE_ON_CLOSE ) ;
        for(int i=0;i<5;i++) {
            panel[i].setBackground(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            panel[i].setPreferredSize(new Dimension(220,100));
            int finalI = i;
            panel[i].addMouseListener(new MouseListener() {
                public void mousePressed(MouseEvent evt){ }
                public void mouseReleased(MouseEvent evt){ }
                public void mouseClicked(MouseEvent evt){ }
                public void mouseEntered(MouseEvent evt){
                    switch (finalI) {
                        case 0:
                            JOptionPane.showMessageDialog(null, "Добро пожаловать в Дахране");
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, "Добро пожаловать Абха");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Добро пожаловать в CENTRE");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Добро пожаловать в NORTH");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Добро пожаловать в Джидда");
                            break;
                    }
                }
                public void mouseExited(MouseEvent evt){ }
            });
        }
        add(panel[0],BorderLayout.EAST);
        add(panel[1],BorderLayout.SOUTH);
        add(panel[2],BorderLayout.CENTER);
        add(panel[3],BorderLayout.NORTH);
        add(panel[4],BorderLayout.WEST);
        setVisible(true);
    }
}


