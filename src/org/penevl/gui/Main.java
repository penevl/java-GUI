package org.penevl.gui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch(Exception ignored){}

        SwingUi ui = new SwingUi();
        ui.init();

    }
}