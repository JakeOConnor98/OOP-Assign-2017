package com.company;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

    public class SnakeDriver {

        private static JFrame frame = new JFrame("Snake");
        private static ArrayList<Snake> mySnake = new ArrayList<Snake>();

        public static void main(String[] args)
        {
            frame.setSize(500,500);

            frame.setBackground(Color.blue);

            frame.setVisible(true);

            mySnake.add(new Snake(20,20));

            frame.add(Snake.get(0));

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }
    }


