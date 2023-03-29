package org.penevl.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUi extends JFrame implements ActionListener{

    JButton red = new JButton("RED");
    JButton green = new JButton("GREEN");
    JButton blue = new JButton("BLUE");

    public SwingUi() {

    }

    public void init() {

        this.setLayout(null);
        this.setSize(400,200);
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

        this.add(blue);
        this.add(green);
        this.add(red);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==red)
            this.getContentPane().setBackground(Color.RED);

        if(e.getSource()==green)
            this.getContentPane().setBackground(Color.GREEN);

        if(e.getSource()==blue)
            this.getContentPane().setBackground(Color.BLUE);

    }
}
