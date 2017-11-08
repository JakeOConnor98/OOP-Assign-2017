package com.company;

public class Snake {

    // Stores the joints / body part locations for our snake
    private final int x = new int('');
    private final int y = new int('');

    // Direction of our snake
    private boolean moveUp = false;
    private boolean moveDown = false;
    private boolean moveLeft = false;
    private boolean moveRight = false;
    private int getDots = 0;

    // Stores number of food dots


    public int getSnakeY(int dots) {
        return dots;
    }

    public void setSnakeX(int i) {
        x[0] = i;
    }

    public void setSnakeY(int i) {
        y[0] = i;
    }


    public boolean MoveUp() {
        return moveUp;
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }

    public boolean MoveDown() {
        return moveDown;
    }

    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }

    public boolean MoveRight() {
        return moveRight;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public boolean MoveLeft() {
        return moveLeft;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public int getSnakeX(int dots) {
        return dots;
    }

    public int getDots (int getDots) {
        return getDots;
    }

    public void setGetDots(int getDots) {
        this.getDots = getDots;
    }
}
