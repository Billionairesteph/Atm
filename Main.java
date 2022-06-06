package com.stephanie;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public void cmpAtm() {

        JFrame myFrame = new JFrame("Cmp Atm"); //window name
        JLabel welcome = new JLabel("WELCOME");
        JLabel cmp = new JLabel("CMP ATM");

        JLabel enter_pin = new JLabel("Enter pin:");
        JTextField ageTextField = new JTextField();


        JButton clickButton = new JButton("Submit");

        myFrame.add(welcome);
        myFrame.add(cmp);

        myFrame.add(enter_pin);
        myFrame.add(ageTextField);
        myFrame.add(clickButton);

        myFrame.setLayout(new GridLayout(3,1)); //3 by 2 grid
        myFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        myFrame.getContentPane().add(clickButton);

        myFrame.setSize(500,200);
        myFrame.setVisible(true);

        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if (e.getSource()==clickButton){
                   Atm.cmpAtm2();
               }

            }

        });
    }


    public static void main(String[] args) {
        Main atm = new Main();
        atm.cmpAtm();
    }



}
