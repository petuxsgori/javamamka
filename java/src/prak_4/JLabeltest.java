package prak_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JLabeltest extends JFrame {
    JPanel[] pnl = new JPanel[25];
    JButton mil=new JButton("Milan");
    JButton real=new JButton("Real Madrid");
    public int gol_mil=0;
    public int real_gol=0;
    JLabel text=new JLabel("Result: "+gol_mil+" : "+real_gol);
    JLabel lastGoal=new JLabel("         Last Scorer:");
    JLabel Winner=new JLabel("");
    public JLabeltest() {
        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        setLayout(new GridLayout(5, 5));
        mil.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                gol_mil=gol_mil+1;
                pokaz(arg0);
                compare();
            }
        });
        pnl[20].add(mil);
        real.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                real_gol=real_gol+1;
                pokaz(arg0);
                compare();
            }
        });
        pnl[24].add(real);
        pnl[12].add(text);
        pnl[10].add(lastGoal);
        pnl[13].add(new JLabel("      Winner:"));

        setSize(500, 500);
    }
    public void pokaz(ActionEvent arg0){
        text.setText("Result: "+gol_mil+" : "+real_gol);
        pnl[12].add(text);
        lastGoal.setText(arg0.getActionCommand());
        pnl[11].add(lastGoal);
        setVisible(true);
    }
    public void compare(){
        if(gol_mil>real_gol)Winner.setText("Milan");
        if(gol_mil<real_gol)Winner.setText("Real Madrid");
        if(gol_mil==real_gol)Winner.setText("N/A");
        pnl[14].add(Winner);
    }
}

