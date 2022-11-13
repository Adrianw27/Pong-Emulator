package ponggame;

import java.awt.*; // Imports used for different utilities and functions such as a JFrame
import java.awt.event.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/*
 *
 * @author Adrian Winter
 * Date: 2022-1-3
 * Project Name: PongGame
 * Description: A program that emulates the original 'PONG' video game. It includes 3 different difficulties and a main menu where you can start and exit game. It has a user controlled by arrow keys and an AI.
 *
 */

public class PongGame { // The class that starts the program with the main method

    public static void main(String[] args) throws InterruptedException {
        MainFrame mainFrame = new MainFrame(); // Create the main menu frame as a new instance of the MainFrame class
    }
}

class MainFrame extends JFrame { // Class with the constructor and all methods involving the main menu frame
    // To learn basics of using multiple classes I used https://stackoverflow.com/questions/48839053/how-to-use-multiple-classes-in-java-in-one-file#:~:text=You%20can%20use%20at%20most,classes%20and%20static%20nested%20classes%20.

    private javax.swing.JButton exitOrHardBtn; // Decleration of the main menu frame components
    private javax.swing.JButton mediumBtn;
    private javax.swing.JButton startOrEasyBtn;
    private javax.swing.JLabel subtitleLbl;
    private javax.swing.JLabel titleLbl;
    int buttonChecker = 1; // Variable used to check whether it was the start/exit or easy/hard button being clicked
    static String title = "PONG EMULATOR"; // Text variables that will replace text in labels
    static String subtitle = "                     Created by Adrian Winter";
    static String startButtonText = "Start Game";
    GameFrame gameFrame = new GameFrame(); // Create a new game frame as an instance of the GameFrame class

    MainFrame() throws InterruptedException { // Constructor that is called when a new MainFrame instance is declared (learned from http://tutorials.jenkov.com/java/constructors.html)
        this.setBackground(Color.GRAY); // Tweak certain settings for the main frame 
        this.setTitle("Adrian's Pong Emulator"); // Used this source to find these methods: https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // <editor-fold defaultstate="collapsed" desc="Generated Code For Main Menu Frame">
        titleLbl = new javax.swing.JLabel();
        subtitleLbl = new javax.swing.JLabel();
        startOrEasyBtn = new javax.swing.JButton();
        exitOrHardBtn = new javax.swing.JButton();
        mediumBtn = new javax.swing.JButton();

        setSize(200, 200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        titleLbl.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(138, 43, 226));
        titleLbl.setText(title);

        subtitleLbl.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        subtitleLbl.setForeground(new java.awt.Color(0, 0, 0));
        subtitleLbl.setText(subtitle);
        subtitleLbl.setAlignmentX(3.0F);
        subtitleLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        startOrEasyBtn.setBackground(new java.awt.Color(152, 97, 165));
        startOrEasyBtn.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        startOrEasyBtn.setForeground(new java.awt.Color(0, 0, 0));
        startOrEasyBtn.setText(startButtonText);
        startOrEasyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        startOrEasyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startOrEasyBtnActionPerformed(evt);
            }
        });

        exitOrHardBtn.setBackground(new java.awt.Color(152, 97, 165));
        exitOrHardBtn.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        exitOrHardBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitOrHardBtn.setText("Exit Game");
        exitOrHardBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        exitOrHardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitOrHardBtnActionPerformed(evt);
            }
        });

        mediumBtn.setBackground(new java.awt.Color(152, 97, 165));
        mediumBtn.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        mediumBtn.setForeground(new java.awt.Color(0, 0, 0));
        mediumBtn.setText("Medium");
        mediumBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        mediumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addComponent(subtitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(titleLbl))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(130, 130, 130)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(exitOrHardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(startOrEasyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtitleLbl)
                                .addGap(48, 48, 48)
                                .addComponent(startOrEasyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(mediumBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(exitOrHardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
        );
        // </editor-fold> // Code generated by the computer that formats the main menu frame 

        this.pack(); // Tweak more settings for the main frame 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        mediumBtn.setVisible(false);
    }

    private void startOrEasyBtnActionPerformed(java.awt.event.ActionEvent evt) { // If the top button is clicked, do this
        if (buttonChecker == 1) { // If it was the start button being clicked, change the identifier so we can figure out which button was clicked next time, now run the start clicked method
            buttonChecker = buttonChecker * -1;
            startClicked();
        } else { // If it was the easy button being clicked, change the identifiers, then run the easy clicked method
            buttonChecker = buttonChecker * -1;
            easyClicked();
        }
    }

    private void exitOrHardBtnActionPerformed(java.awt.event.ActionEvent evt) { // If the bottom button was clicked, do this
        if (buttonChecker == 1) { // Do the exact same thing as the previous method, but run the exit clicked method instead
            buttonChecker = buttonChecker * -1;
            exitClicked();
        } else { // Same thing as above but run hard clicked method
            buttonChecker = buttonChecker * -1;
            hardClicked();
        }
    }

    private void mediumBtnActionPerformed(java.awt.event.ActionEvent evt) { // If the middle button is clicked, do this
        Paddle.aiSpeed = 4; // Set the ball and ai speeds to the ones for the medium difficulty and then start setting up the game
        Ball.xBallSpeed = 4;
        Ball.yBallSpeed = 5;
        gameSetup();
    }

    public void startClicked() { // When the start button is clicked, change the labels on the buttons to show the difficulties
        subtitleLbl.setVisible(false);
        startOrEasyBtn.setText("Easy");
        mediumBtn.setVisible(true);
        exitOrHardBtn.setText("Hard");
        titleLbl.setText("  Select Difficulty");
    }

    public static void exitClicked() { // When the exit button is clicked exit the system
        System.exit(0);
    }

    public void easyClicked() { // When easy is clicked, 
        Paddle.aiSpeed = 2; // Set the ball and ai speeds to the ones for the easy difficulty and then start setting up the game
        Ball.xBallSpeed = 2;
        Ball.yBallSpeed = 3;
        gameSetup();
    }

    public void hardClicked() { // When hard is clicked, 
        Paddle.aiSpeed = 6; // Set the ball and ai speeds to the ones for the hard difficulty and then start setting up the game
        Ball.xBallSpeed = 6;
        Ball.yBallSpeed = 7;
        gameSetup();
    }

    public void gameSetup() { // Reset the main menu frame for the next time it will be used, and make the game frame visible
        startOrEasyBtn.setText("Play Again");
        exitOrHardBtn.setText("Exit");
        mediumBtn.setVisible(false);
        subtitleLbl.setVisible(true);
        setVisible(false);
        gameFrame.pack();
        gameFrame.setVisible(true);
    }
}

class GameFrame extends JFrame { // Class with the constructor and all methods involving the game frame

    GamePanel panel;

    GameFrame() { // When a new GameFrame instance is declared, do this
        panel = new GamePanel(); // Create a new panel as an instance of the GamePanel class to contain the graphics
        this.add(panel); // Add the panel to the game frame
        this.setBackground(Color.GRAY); // Tweak certain settings of the game frame
        this.setTitle("Adrian's Pong Emulator");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(false);
        this.setLocationRelativeTo(null);
    }
}

class GamePanel extends JPanel implements Runnable { // Class with the constructor and all methods involving the panel being drawn on in the game frame

    static final int SCREENHEIGHT = 350; // Declare constant variables that will be used for locations and checking collisions
    static final int SCREENWIDTH = 624;
    static final Dimension SCREENSIZE = new Dimension(SCREENWIDTH, SCREENHEIGHT);
    static final int PADDLEWIDTH = 18;
    static final int PADDLEHEIGHT = 90;
    static final int BALLWIDTH = 18;
    static final int XAILOCATION = 544;
    static final int XUSERLOCATION = 62;
    Paddle aiPaddle; // Declare every item that needs to be drawn
    Paddle userPaddle;
    Random random;
    Ball ball;
    Score score = new Score();
    Thread gameThread; // Used this to learn threads http://tutorials.jenkov.com/java-concurrency/creating-and-starting-threads.html

    GamePanel() { // When a new GamePanel instance is declared, do this
        resetPaddles(); // Reset the paddles every time a new game panel is created
        resetBall(); // Reset the balls
        this.setFocusable(true);
        this.addKeyListener(new kl()); // Add a key listener to the panel as an instance of the kl class which detects key presses
        this.setPreferredSize(SCREENSIZE);

        gameThread = new Thread(this); // Create new instance of Thread
        gameThread.start(); // Start the thread
    }

    public void resetBall() {
        ball = new Ball(); // Replace 'ball' with a new instance of the Ball class
    }

    public void resetPaddles() {
        aiPaddle = new Paddle(2); // Replace 'aiPaddle' and 'userPaddle' with a new instance of the Paddle class 
        userPaddle = new Paddle(1); // Use an identifier so the program knows what x location to use
    }

    public void update() { // Create an update method that will constantly be called 
        ball.update(); // Run update methods from instances of different classes to actually update locations
        aiPaddle.updateAiPaddle();
        userPaddle.updateUserPaddle();
    }

    public void draw(Graphics g) { // When repaint/paint is called, it will call this
        aiPaddle.draw(g); // Call all the draw methods from each instance of all the classes
        userPaddle.draw(g);
        ball.draw(g);
        score.draw(g);
    }

    public void paint(Graphics g) { // This is called right away once and also everytime repaint is called
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 624, 350); // Clear the panel
        draw(g); // Draw everything on the screen
    }

    public void checkCollision() { // Check for every possible collision, is constantly being ran in game loop

        // Makes the ball bounce off the sides of the paddles
        if (ball.xBallSpeed == 2 || ball.xBallSpeed == 4) { // If the difficulty is easy or medium...
            if (ball.xBallLocation == 79 && ball.yBallLocation <= userPaddle.yUserLocation + PADDLEHEIGHT && ball.yBallLocation + BALLWIDTH >= userPaddle.yUserLocation) {
                Ball.collisionDetected(1);
            } else if (ball.xBallLocation + BALLWIDTH == 624 - 79 && ball.yBallLocation <= aiPaddle.yAiLocation + PADDLEHEIGHT && ball.yBallLocation + BALLWIDTH >= aiPaddle.yAiLocation) {
                Ball.collisionDetected(1);
            }
        } else { // Exact same as the above if statement but for hard difficulty (because speed is different so it won't hit the same coordinates)
            if (ball.xBallLocation == 81 && ball.yBallLocation <= userPaddle.yUserLocation + PADDLEHEIGHT && ball.yBallLocation + BALLWIDTH >= userPaddle.yUserLocation) {
                Ball.collisionDetected(1);
            } else if (ball.xBallLocation + BALLWIDTH == 624 - 81 && ball.yBallLocation <= aiPaddle.yAiLocation + PADDLEHEIGHT && ball.yBallLocation + BALLWIDTH >= aiPaddle.yAiLocation) {
                Ball.collisionDetected(1);
            }
        }

        // Makes the ball bounce off the top or bottom of the paddles
        if (ball.yBallLocation <= userPaddle.yUserLocation + PADDLEHEIGHT + 2 && ball.yBallLocation > userPaddle.yUserLocation + PADDLEHEIGHT - 5 && ball.xBallLocation < 79 && ball.xBallLocation + BALLWIDTH > XUSERLOCATION - 1) {
            Ball.collisionDetected(2);
        } else if (ball.yBallLocation + BALLWIDTH >= userPaddle.yUserLocation - 2 && ball.yBallLocation + BALLWIDTH < userPaddle.yUserLocation + 5 && ball.xBallLocation < 79 && ball.xBallLocation + BALLWIDTH > XUSERLOCATION - 1) {
            Ball.collisionDetected(3);
        }
        if (ball.yBallLocation <= aiPaddle.yAiLocation + PADDLEHEIGHT + 2 && ball.yBallLocation > aiPaddle.yAiLocation + PADDLEHEIGHT - 5 && ball.xBallLocation < 624 - 79 && ball.xBallLocation + BALLWIDTH > XAILOCATION + 1) {
            Ball.collisionDetected(2);
        } else if (ball.yBallLocation + BALLWIDTH >= aiPaddle.yAiLocation - 2 && ball.yBallLocation + BALLWIDTH < aiPaddle.yAiLocation + 5 && ball.xBallLocation < 624 - 79 && ball.xBallLocation + BALLWIDTH > XAILOCATION + 1) {
            Ball.collisionDetected(3);
        }

        // Conditionals to stop the paddles from going off screen
        if (Paddle.yUserLocation <= 0) {
            Paddle.collisionDetected(1);
        } else if (Paddle.yUserLocation + PADDLEHEIGHT >= SCREENHEIGHT) {
            Paddle.collisionDetected(2);
        } else if (Paddle.yAiLocation <= 0) {
            Paddle.collisionDetected(3);
        } else if (Paddle.yAiLocation + PADDLEHEIGHT >= SCREENHEIGHT) {
            Paddle.collisionDetected(4);
        }

        // Updates score and resets screen when ball goes off right or left side of screen
        if (ball.xBallLocation <= 0) {
            score.aiScore++;
            resetPaddles();
            resetBall();
        } else if (ball.xBallLocation + BALLWIDTH >= SCREENWIDTH) {
            score.userScore++;
            resetPaddles();
            resetBall();
        }

        // Stops ball from going off bottom or top of screen
        if (ball.yBallLocation <= 0) {
            Ball.collisionDetected(0);
        } else if (ball.yBallLocation + BALLWIDTH >= SCREENHEIGHT) {
            Ball.collisionDetected(0);
        }
    }

    // This run method is called on by the thread - gameThread
    public void run() { // Used https://gamedev.net/forums/topic/687454-understanding-game-loops/5339219/ to create this simple game loop
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while (true) { // This loop will always run at around 60 FPS unless broken
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                if (userPaddle.gameStart == true) { // If a key detection is pressed to activate the gameStart variable, do this
                    if (Score.userScore == 10) { // If the user reached 10
                        try { // Reset/change all the important variables and then create a new instance of the MainFrame class to restart the program
                            MainFrame.title = "    YOU WON !!";
                            MainFrame.subtitle = "                               good job :)";
                            MainFrame.startButtonText = "Play Again";
                            Score.resetScores();
                            resetBall();
                            resetPaddles();
                            MainFrame mainFrame = new MainFrame();
                            break;
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if (Score.aiScore == 10) { // If the AI reached 10
                        try { // Reset/change all the important variables and then create a new instance of the MainFrame class to restart the program
                            MainFrame.title = "    YOU LOST :(";
                            MainFrame.subtitle = "                         better luck next time";
                            MainFrame.startButtonText = "Play Again";
                            Score.resetScores();
                            resetBall();
                            resetPaddles();
                            MainFrame mainFrame = new MainFrame();
                            break;
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GamePanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else { // If no one has reached 10 yet
                        update(); // Update the locations of the paddles and ball
                        checkCollision(); // Check if any collisions have occured and make location changes if they have
                        repaint(); // Redraw everything in their new locations
                    }
                } else {
                }
                delta--;
            }
        }
    }

    public class kl extends KeyAdapter { // Learned this at https://stackoverflow.com/questions/34274028/creating-a-class-that-extends-keylistener

        public void keyPressed(KeyEvent e) { // If a key is pressed on the panel, call a method in the userPaddle instance to move it
            userPaddle.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) { // If a key is released on the panel, call a method in the userPaddle instance to stop moving it
            userPaddle.keyReleased(e);
        }
    }
}

class Paddle { // Class with the constructor and all methods involving the paddles (move paddles,draw paddles,etc)

    int id; // This int will be used to see which paddle to create
    boolean gameStart = false;
    static int yUserLocation = 170; // These ints are used to update the paddle locations
    static int yAiLocation = 170;
    static double aiSpeed;
    int userDirection = 0;
    static final int USERSPEED = 4; // Constant ints used to easily input locations and dimensions
    static final int XAILOCATION = 544;
    static final int XUSERLOCATION = 62;
    static final int PADDLEWIDTH = 18;
    static final int PADDLEHEIGHT = 90;

    Paddle(int identifier) { // When a new Paddle(int) instance is declared, do this
        id = identifier; // Store the parameter input in a variable
        gameStart = false; // Pause the game
        yUserLocation = 170; // Reset their locations
        yAiLocation = 170;
    }

    public void keyPressed(KeyEvent e) { // Called by the key listener when a key is pressed
        if (e.getKeyCode() == KeyEvent.VK_UP) { // If they press the up key, change the direction to up (https://math.hws.edu/eck/cs124/javanotes3/c6/s5.html#:~:text=The%20key%20codes%20for%20the,VK_UP%2C%20and%20KeyEvent.)
            userDirection = 1;
            gameStart = true;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) { // If they press the down key, change the direction to down
            userDirection = 2;
            gameStart = true;
        }
    }

    public void keyReleased(KeyEvent e) { // Called by the key listener when a key is pressed
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) { // If either of those pressed keys is released, set the direction to nothing
            userDirection = 0;
        }
    }

    public static void collisionDetected(int checker) { // If a paddle collision was detected, check which paddle it was, and if they collided with the top or bottom
        if (checker == 1) { // Then, update their location to make sure they don't go through the screen
            yUserLocation = 0;
        } else if (checker == 2) {
            yUserLocation = 260;
        } else if (checker == 3) {
            yAiLocation = 0;
        } else {
            yAiLocation = 260;
        }
    }

    public void updateUserPaddle() { // When called, move the paddle by its speed, up or down, based on the direction given from the key presses
        if (userDirection == 1) {
            yUserLocation -= USERSPEED;
        } else if (userDirection == 2) {
            yUserLocation += USERSPEED;
        }
    }

    public void updateAiPaddle() { // When called, see where the ball is in relation to the ai paddle
        if (Ball.yBallLocation < yAiLocation) { // If the ball is above the paddle, move the paddle up by its speed
            yAiLocation -= aiSpeed;
        } else if (Ball.yBallLocation + 18 > yAiLocation + PADDLEHEIGHT) { // If the ball is below the paddle, move the paddle down by its speed
            yAiLocation += aiSpeed;
        }
    }

    public void draw(Graphics g) { // This is called to paint or repaint the paddles on the screen at these locations and sizes
        if (id == 1) { // If this was called through an instance created with a 1 in the parameter slot, draw/update a user paddle
            g.setColor(Color.magenta);
            g.fillRect(XUSERLOCATION, yUserLocation, PADDLEWIDTH, PADDLEHEIGHT); // (border)
            g.setColor(Color.cyan);
            g.fillRect(XUSERLOCATION + 3, yUserLocation + 3, PADDLEWIDTH - 6, PADDLEHEIGHT - 6);
        } else { // If the instance was created with anything else in the parameter slot, draw/update an ai paddle 
            g.setColor(Color.magenta); // (if aiPaddle.draw(g) is called, the id will be 0 since it was declared aiPaddle=new Paddle(0);)
            g.fillRect(XAILOCATION, yAiLocation, PADDLEWIDTH, PADDLEHEIGHT); // (border)
            g.setColor(Color.cyan);
            g.fillRect(XAILOCATION + 3, yAiLocation + 3, PADDLEWIDTH - 6, PADDLEHEIGHT - 6);
        }
        if (gameStart == false) { // If no keys have yet been pressed, tell the user to press a key to start
            g.setColor(Color.BLACK);
            g.setFont(new java.awt.Font("Ebrima", 1, 24));
            g.drawString("press up or down key to start", 140, 50);
        } else { // If a key has been pressed and the game is active, cover the text with a rectangle
            g.setColor(Color.GRAY);
            g.fillRect(140, 10, 350, 100);
        }
    }
}

class Ball { // Class with the constructor and all methods involving the ball (move ball,draw ball, etc)

    Random random; // This will generate a ranodm number for a random direction at the start
    static int xBallSpeed; // Variables used to store directions, speeds, and locations that will be used to update the ball location
    static int yBallSpeed;
    static int xBallDirection;
    static int yBallDirection;
    static int yBallLocation = 194;
    static int xBallLocation = 624 / 2 - 9;

    Ball() { // When a new Ball instance is declared, do this
        yBallLocation = 194; // Reset the location
        xBallLocation = 624 / 2 - 9;
        random = new Random(); // Create a new instance of the imported Random class
        xBallDirection = random.nextInt(2); // Generate a number from 0-1
        if (xBallDirection == 0) { // If the number was 0, change the direction to -1, but if it was 1 keep it at that
            xBallDirection -= 1;
        }
        yBallDirection = random.nextInt(2); // Same thing as above but for the y direction this time not x
        if (yBallDirection == 0) {
            yBallDirection -= 1;
        }
    }

    public void update() { // When the ball is called to be updated, add its speed times direction to the location
        xBallLocation += xBallSpeed * xBallDirection;
        yBallLocation += yBallSpeed * yBallDirection;
    }

    public static void collisionDetected(int checker) { // When a ball collision is detected...
        if (checker == 0) { // Depending on what it collding with, flip either the ball's x or y direction to make it 'bounce' the other direction
            yBallDirection *= -1;
        } else if (checker == 2){
            yBallDirection = 1;
        }
        else if (checker == 3){
            yBallDirection = -1;
        }
        else {
            xBallDirection *= -1;
        }
    }

    public void draw(Graphics g) { // when called this will paint the ball on the screen at these locations and sizes
        g.setColor(Color.black);
        g.fillRect(xBallLocation, yBallLocation, 18, 18); // (border)
        g.setColor(Color.magenta);
        g.fillRect(xBallLocation + 3, yBallLocation + 3, 18 - 6, 18 - 6);
    }
}

class Score { // Class with the constructor and all methods involving the score (draw,update,reset scores)

    static int userScore = 0; // Declare variables to store the score values
    static int aiScore = 0;

    public void draw(Graphics g) { // Every time repaint is called, run all these graphics commands that draw the score and middle line
        g.setColor(Color.BLACK);
        g.setFont(new java.awt.Font("Dialog", 1, 36));
        g.drawString(String.valueOf(userScore), 20, 35);
        g.drawString(String.valueOf(aiScore), 584, 35);
        g.drawLine(GamePanel.SCREENWIDTH / 2, 0, GamePanel.SCREENWIDTH / 2, 350);
    }

    public static void resetScores() { // Call this method when the game ends to reset the scores to 0
        userScore = 0;
        aiScore = 0;
    }
}
