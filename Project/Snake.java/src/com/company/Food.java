package com.company;

import java.awt.*;
import javax.swing.*;

public class Food extends JPanel{


    // Used to determine random position of food
    public final int RANDOMPOSITION = 60;

    public void draw(Graphics graphics) {

        System.out.println("Getting called");
        graphics.setColor(Color.WHITE);

        /*If you want the food to appear at random locations on the game screen then you will have to
        give random values to x and y here, using the Math.random() */


        int x = (int) getLocation().getX();
        int y = (int) getLocation().getY();
        //int x = 0;
        //int y = 0;
        graphics.fillRect(x, y, 20, 20);}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void foodLocation(){
        return;
    }




    /*public void createFood() {

        // Set our food's x & y position to a random position

        int location = (int) (Math.random() * RANDOMPOSITION);
        FoodX = ((location * Snake.getDotSize()));

        location = (int) (Math.random() * RANDOMPOSITION);
        FoodY = ((location * Snake.getDotSize()));

        if ((FoodX == snake.getSnakeX()) && (FoodY == snake.getSnakeX())) {
            createFood();
        }
    }*/

   /*() public int getFoodX() {

        return FoodX;
    }

    public int getFoodY() {
        return FoodY;
    }*/



}


