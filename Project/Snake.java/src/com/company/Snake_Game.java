package com.company;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;





public class Snake_Game extends JPanel implements ActionListener, KeyListener, Runnable {

       private Graphics g;
       Snake s;
       BodyPart b;
       Food f;
       final int DELTA_X = 20;
       final int DELTA_Y = 20;
       private int score;

       Thread theThread;//Added by JB to paint screen continuously while still dealing with key events
       boolean gameOn; //Added by JB to guard the game loop
       int i=0;
       Container c;
       JFrame frame;







        JMenu menu, submenu;
        {
            //Thsi is the Menu Bar
            JMenuBar mb = new JMenuBar();
            //Create the JMenu
            menu = new JMenu("Options");
            menu.add(menu);
            //Create a submenu
            submenu = new JMenu("Save");
            submenu = new JMenu("Quit");
            menu.add(submenu);

            //frame.setMenuBar(mb);
            mb.setSize(100, 100);
            mb.setLayout(null);
            mb.setVisible(true);
        }


    public static void main(String args[])
    {
        new Menu();
    }


    //This is the JFrame of the game

       public Snake_Game() {
           frame = new JFrame();
           frame.setTitle("Snake Game");

           c = frame.getContentPane();
           c.setPreferredSize(new Dimension(500,500));

           c.setBackground(Color.BLACK);


           s = new Snake();
           b = new BodyPart();
           f = new Food();




           s.setLocation(220, 200);
           b.setLocation(200, 200);
           f.setLocation(350, 350);


           //frame.setLocationRelativeTo(null);
           frame.addKeyListener(this);

           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.pack();
           frame.setVisible(true);


           gameOn = true;
           start();
           collisionFood();
           collisionBorder();



       }
       //This places a scoreboard on the Jframe
       private static final Font SMALL_FONT = new Font("Times New Roman", Font.BOLD, 20);



       //This paints the Snake on the JFrame
    public void paint(Graphics g) {

        System.out.println("Paint call " + i++);

        g.setColor(Color.BLUE); //background colour for image
        g.fillRect(0, 0, c.getWidth(), c.getHeight());

        System.out.println(s.getLocation().getX() + "\t" + s.getLocation().getY());

        if(s.getDirection().equals("Right")) {

            //JB - you need to add the code so that the body of the snake will move into the area of the screen
            //that was previously occupied by the head of the snake
            //and you need to expand on this later to ensure all parts of the body move into the positions
            //that were occupied by the parts ahead of them in the snakes body

            //JB - the code below will ensure the snakes head moves to the right when the right key is pressed
            //The thread then ensures it will continue to move automatically every 500ms

            /* Note the current location of the snakes head and make a copy of it*/

            s.setLocation((int) s.getLocation().getX() + DELTA_X, (int) s.getLocation().getY());


            /*Now move the first part of the snakes body to this location*/

            b.setLocation((int) b.getLocation().getX() + DELTA_X, (int) b.getLocation().getY());


        }
        else if(s.getDirection().equals("Left")) {

            //complete this
            s.setLocation((int)b.getLocation().getX() - DELTA_X,(int)s.getLocation().getY());
            b.setLocation((int)b.getLocation().getX() - DELTA_X,(int)b.getLocation().getY());
        }
        else if(s.getDirection().equals("Down")) {

           //complete this - the code below ensures the snakes head will move down on the down arrow key press

            s.setLocation((int) s.getLocation().getX(), (int) s.getLocation().getY()+DELTA_Y);
            b.setLocation((int) s.getLocation().getX(), (int) b.getLocation().getX()+DELTA_Y);

        }
        if(s.getDirection().equals("Up")) {

            //complete
            s.setLocation((int)s.getLocation().getX(),(int)s.getLocation().getY()-DELTA_Y);
            b.setLocation((int)s.getLocation().getX(),(int)b.getLocation().getY()-DELTA_Y);
        }

        //now that the snakes head (and body once you have it completed) have moved position, draw them
        s.draw(g);
        b.draw(g);
        f.draw(g);
        g.setColor(Color.WHITE);
        g.drawString("Current Score: 0",20,20);

    }

        /*Put in tests to see whether the snakes head has collided with the food, if it has then update the
        players (or snake's) score to reflect this and make the food disappear from the screen, and then spawn
        another body part for the snake and generate another piece of food in a random location on the screen
        (making sure the piece of food doesn't overlap the snake (a little complexity, using a loop)

        Maybe think about creating a Player class with a name and score attribute?*/

        public void collisionFood(){
            if(s.getLocation().getX() == f.getX() || s.getLocation().getY() == f.getY()){
                JOptionPane.showInputDialog("Nice");
                collisionFood();
                score++;

            }
       }

       public void collisionBorder(){
            if(s.getLocation().getX() <0 || s.getLocation().getX() >1500 || s.getLocation().getY() <0 || s.getLocation().getY() > 1500){
                JOptionPane.showInputDialog("Game Over - Please enter name");
                collisionBorder();
            }
       }


       public void saveData() throws IOException {
           ObjectOutputStream os;
           os = new ObjectOutputStream(new FileOutputStream
                   ("Snake Game"));
           os.writeObject("Score");
           os.close();
       }



       @Override
       public void actionPerformed(ActionEvent e) {

       }

       @Override
       public void keyTyped(KeyEvent e) {
           System.out.println("Got here!");
       }

       @Override
       public void keyPressed(KeyEvent e) {

           System.out.println("Got here!");

           if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

               //JB - as long as the current direction isn't left, you can move the snake to the right

               if(!s.getDirection().equals("Left"))
                   s.setDirection("Right");



           }


           if (e.getKeyCode() == KeyEvent.VK_LEFT){

               if(!s.getDirection().equals("Right"))
                   s.setDirection("Left");




           }


           if (e.getKeyCode() == KeyEvent.VK_UP) {

               if (!s.getDirection().equals("Down"))
                   s.setDirection("Up");
           }





           if (e.getKeyCode() == KeyEvent.VK_DOWN)


           {
               //JB - as long as the current direction isn't up, you can move the snake downwards

               if(!s.getDirection().equals("Up"))
                    s.setDirection("Down");


           }

       }




       @Override
       public void keyReleased(KeyEvent e) {

       }

       //JB - called automatically by the start() method below. Because the game needs to draw information onto the screen
       //and listen for keyboard/other events at the same time, an extra thread of execution is recommended. The run()
       //method basically ensures that the pane of the JFrame window gets painted/updated every 20 milliseconds
       //giving us 50 frames per second as such. The thread sleeps in between these updates meaning that the rest
       //of the time events can be listened for and handled without any conflict

       //thread really needed only because we need it to continually repaint() the screen if we want to draw the bullets moving as well
       //as the enemy invaders, otherwise we could have done without it as the key press actions could be set up to make calls to paint() as they go

       public void run()
       {

           g = c.getGraphics();

           while(gameOn)
           {
               try
               {
                   if(g!=null)
                      paint(g);

                   Thread.sleep(100); //JB - I have set it very slow so you'll find it easier when testing out the game


               }
               catch (InterruptedException e)
               {
                   break;
               }
           }
           System.out.println("Game now over!");

       }

       //JB - As the class implements the Runnable interface, this method will be called automatically when an instance of it is created
       //in the main() above. It basically creates a new Thread object, links it with the game instance and sets the thread in motion
       //with the call to start() on the thread reference

       public void start()
       {
           if (theThread == null)
           {
               System.out.println("Creating new thread");
               theThread = new Thread(this);
               theThread.start();
           }
       }










   }
