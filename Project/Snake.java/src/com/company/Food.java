package com.company;

import java.awt.*;
import javax.swing.*;

public class Food extends JPanel{


    // Used to determine random position of food
    public final int RANDOMPOSITION = 60;

    public void draw(Graphics graphics) {

        System.out.println("Getting called");
        graphics.setColor(Color.WHITE);

        /**If you want the food to appear at random locations on the game screen then you will have to
        give random values to x and y here, using the Math.random() */


        int x = (int) getLocation().getX();
        //int x = (int) Math.random();
        int y = (int) getLocation().getY();
        //int y = (int) Math.random();

        graphics.fillRect(x, y, 20, 20);}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void foodLocation(){
        return;
    }}



