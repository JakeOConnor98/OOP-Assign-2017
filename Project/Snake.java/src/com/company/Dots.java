package com.company;

public class Dots {


        private Snake snake = new Snake();
        private int dotsX;
        private int dotsY;

        // Used to determine random position of food
        private final int RANDOMPOSITION = 60;

        public void createDots() {

            // Set our food's x & y position to a random position

            int location = (int) (Math.random() * RANDOMPOSITION);
            dotsX = ((location * Snake.getDotSize()));

            location = (int) (Math.random() * RANDOMPOSITION);
            dotsY = ((location * Snake.getDotSize()));

            if ((dotsX == snake.getSnakeX()) && (dotsY == snake.getSnakeX())) {
                createDots();
            }
        }

        public int getFoodX() {

            return dotsX;
        }

        public int getFoodY() {
            return dotsY;
        }
    }

