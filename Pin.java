package com.stephanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin {
    public static void cmpAtm5() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JLabel limit = new JLabel("Enter pin");
        JTextField pin = new JTextField();
        JButton comfirm = new JButton("Comfirm");


        myFrame.add(limit);
        myFrame.add(pin);
        myFrame.add(comfirm);


        myFrame.setLayout(new GridLayout(3, 2)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(500, 400);
        myFrame.setVisible(true);
           comfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == comfirm) {
                    Success.cmpAtm6();
                }

            }

        });

    }
}
