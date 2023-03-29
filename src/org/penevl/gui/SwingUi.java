package org.penevl.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUi extends JFrame implements ActionListener{

    JButton red = new JButton("RED");
    JButton green = new JButton("GREEN");
    JButton blue = new JButton("BLUE");
    JButton goodDay = new JButton("Today is a good day");
    JLabel text = new JLabel("Initial text");
    public SwingUi() {

    }

    public void init() {

        this.setLayout(null);
        this.setSize(520,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.YELLOW);

        red.setBounds(20,20,100,25);
        red.setVisible(true);
        red.setFocusable(false);
        red.addActionListener(this);

        green.setBounds(140,20,100,25);
        green.setVisible(true);
        green.setFocusable(false);
        green.addActionListener(this);

        blue.setBounds(260,20,100,25);
        blue.setVisible(true);
        blue.setFocusable(false);
        blue.addActionListener(this);

        goodDay.setBounds(380,20,100,25);
        goodDay.setVisible(true);
        goodDay.setFocusable(false);
        goodDay.addActionListener(this);

        text.setBounds(200,55,300,25);
        text.setVisible(true);

        this.add(text);
        this.add(goodDay);
        this.add(blue);
        this.add(green);
        this.add(red);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            this.getContentPane().setBackground(Color.RED);
            this.setTitle("I am red");
            text.setText("Red pressed");
        }

        if (e.getSource() == green){
            this.getContentPane().setBackground(Color.GREEN);
            this.setTitle("I am green");
            text.setText("Green pressed");
        }

        if (e.getSource()==blue) {
            this.getContentPane().setBackground(Color.BLUE);
            this.setTitle("I am blue");
            text.setText("Blue pressed");
        }

        if (e.getSource()==goodDay)
            this.setTitle("Today is a good day");


    }
}
