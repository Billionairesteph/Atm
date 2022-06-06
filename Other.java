package com.stephanie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Other {
    public static void cmpAtm4() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JLabel limit = new JLabel("You have a withdeawal limit of 50,000");
        JTextField withdrawAmount = new JTextField();
        JButton with = new JButton("Withdraw");


        myFrame.add(limit);
        myFrame.add(withdrawAmount);
        myFrame.add(with);


        myFrame.setLayout(new GridLayout(3, 2)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(500, 400);
        myFrame.setVisible(true);
        with.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == with) {
                    Pin.cmpAtm5();
                }

            }

        });

    }
}
