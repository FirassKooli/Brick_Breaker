
// DISCLAIMER: This project is adapted from the "Brick Breaker Game in Java" available at https://copyassignment.com/brick-breaker-game-in-java/.
// It is used solely for educational and non-profit purposes, serving as a template for a Java project and to showcase some of Java's graphics capabilities.
// We do not claim ownership or any other rights to the original work.
// All credit for the original project goes to its respective creators.

import javax.swing.*;

class Main
{
    public static void main(String[] args)
    {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}
