package com.company;

import java.awt.*;
import javax.swing.*;
import java.util.*;



public class Snake extends JPanel{
    // Directions for our snake
    //private int score;
    private String direction = ""; //added by JB to get snake moving in a certain direction on keypress
    private final int MAX_BODY_SIZE = 10;
    private ArrayList<BodyPart> snakeBody;
    public void setDirection(String direction)
    {
        this.direction = direction;
    }//added by JB to get/set snake direction

    public String getDirection()
    {
        return direction;
    }



    //This determines the location of the snake head.
    public int getSnakeX() {
        return getSnakeX();
    }

    private int getSnakeY() {
        return getSnakeY();
    }



    //Building our Snake
    //Added by JB to draw() snake in a particular location
    public void draw(Graphics graphics) {

        System.out.println("Getting called");
        graphics.setColor(Color.GREEN);
        int x = (int)getLocation().getX();
        int y = (int)getLocation().getY();
        graphics.fillRect(x, y, 20, 20);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public Dimension getPreferredSize()
    {
        return new Dimension(20,20);
    }

}


class BodyPart extends JPanel{

    //Added by JB to draw() body in a particular location
    public void draw(Graphics graphics) {

        System.out.println("Getting called");
        graphics.setColor(Color.RED);
        int x = (int)getLocation().getX();
        int y = (int)getLocation().getY();
        graphics.fillRect(x, y, 20, 20);




    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }


    public Dimension getPreferredSize()
    {
        return new Dimension(20,20);
    }

}




