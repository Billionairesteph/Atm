
package com.stephanie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawal {
    public static void cmpAtm3() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JLabel limit = new JLabel("You have a withdeawal limit of 50,000");
        JButton five = new JButton("5000");
        JButton ten = new JButton("10000");
        JButton fifteen = new JButton("15000");
        JButton others = new JButton("Others");

        myFrame.add(limit);
        myFrame.add(five);
        myFrame.add(ten);
        myFrame.add(fifteen);
        myFrame.add(others);

        myFrame.setLayout(new GridLayout(3, 2)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(800, 400);
        myFrame.setVisible(true);
        others.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == others) {
                    Other.cmpAtm4();
                }

            }

        });
    }
}
