package com.company;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class StartMenu extends JPanel {

   public StartMenu() {
   JButton button = new JButton ("Start Game");
   button.setAlignmentX(CENTER_ALIGNMENT);
   add(button);

   }

   @Override
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       g.drawImage(new ImageIcon(StartMenu.class.getResource("Snake.png")).getImage(), 0, 0, 640, 480, this);
   }
}