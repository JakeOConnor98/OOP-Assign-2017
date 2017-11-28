package com.company;

import java.awt.*;
import javax.swing.*;
import java.util.*;



public class Snake extends JPanel{
    // Directions for our snake
    private int score;
    private boolean Up = false;
    private boolean Down = false;
    private boolean Left = false;
    private boolean Right = false;
    private String direction = ""; //added by JB to get snake moving in a certain direction on keypress
    private int getDots = 0;
    private final int MAX_BODY_SIZE = 10;
    private ArrayList<BodyPart> snakeBody;

    public static int getDotSize() {
        return getDotSize();
    }


    public boolean MoveUp() {
        return Up;
    }

    public void setMoveUp(boolean moveUp) {
        this.Up = moveUp;
    }

    public boolean MoveDown() {
        return Down;
    }

    public void setMoveDown(boolean moveDown) {
        this.Down = moveDown;
    }

    public boolean MoveRight() {
        return Right;
    }

    public void setMoveRight(boolean moveRight) {
        this.Right = moveRight;
    }

    public boolean MoveLeft() {
        return Left;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.Left = moveLeft;
    }

    //added by JB to get/set snake direction

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public String getDirection()
    {
        return direction;
    }

    //The Snake collects food
    public int getDots(int getDots) {
        return getDots;
    }

    public void setGetDots(int getDots) {
        this.getDots = getDots;
    }


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
        //int x = 0;
        //int y = 0;
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
        //int y = 0;
        //int x = 0;
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




