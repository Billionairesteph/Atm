package com.stephanie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atm {
    public static void cmpAtm2() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JButton check = new JButton("Check Balance");
        JButton airtime = new JButton("Airtime");
        JButton savings = new JButton("Savings");
        JButton current = new JButton("Current");


        myFrame.add(check);
        myFrame.add(airtime);
        myFrame.add(savings);
        myFrame.add(current);

        myFrame.setLayout(new GridLayout(2, 2)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(500, 200);
        myFrame.setVisible(true);
        savings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == savings) {
                    Withdrawal.cmpAtm3();
                }

            }

        });


    }
    }
