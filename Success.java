package com.stephanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Success {
    public static void cmpAtm6() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JLabel success = new JLabel("SUCCESS!!!!");


        myFrame.add(success);



        myFrame.setLayout(new GridLayout(3, 2)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setSize(500, 400);
        myFrame.setVisible(true);


    }
}
