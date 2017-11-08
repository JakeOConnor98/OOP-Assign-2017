package com.company;


import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.*;



public class Snake_Game extends JFrame {


    public static void main(String args[]) {
        Snake_Game frame = new Snake_Game();
        frame.setVisible(true);
    }

    private Snake_Game() {
        JFrame frame = new JFrame("Snake Game");

        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("This is a label!");

        JButton button = new JButton();
        button.setText("Click me");

        panel.add(label);

        panel.add(button);

        frame.add(panel);

        frame.setSize(1300, 1300);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

