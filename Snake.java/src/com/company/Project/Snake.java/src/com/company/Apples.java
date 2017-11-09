package com.company;

public class Apples {


        private Snake snake = new Snake();
        private int appleX;
        private int appleY;

        // Used to determine random position of food
        private final int RANDOMPOSITION = 60;

        public void createDots() {

            // Set our food's x & y position to a random position

            int location = (int) (Math.random() * RANDOMPOSITION);
            appleX = ((location * Snake.getAppleSize()));

            location = (int) (Math.random() * RANDOMPOSITION);
            appleY = ((location * Snake.getAppleSize()));

            if ((appleX == snake.getSnakeX(0)) && (appleY == snake.getSnakeX(0))) {
                createApples();
            }
        }

    private void createApples() {
    }

    public int getAppleX() {

            return appleX;
        }

        public int getAppleY() {
            return appleY;
        }
    }

