
// DISCLAIMER: This project is adapted from the "Brick Breaker Game in Java" available at https://copyassignment.com/brick-breaker-game-in-java/.
// It is used solely for educational and non-profit purposes, serving as a template for a Java project and to showcase some of Java's graphics capabilities.
// We do not claim ownership or any other rights to the original work.
// All credit for the original project goes to its respective creators.

import java.awt.*;

class MapGenerator {

    public int map [][];
    public int brickWidth;
    public int brickHeight;

    // this creates the brick of size 3x7
    public MapGenerator(int row, int col) {
        map = new int [row][col];
        for (int i = 0; i < map.length; i++) {
            for (int j=0; j< map[0].length;j++) {
                map[i][j] = 1;
            }
        }

        brickWidth = 540/col;
        brickHeight = 150/row;
    }

    // this draws the bricks
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j=0; j< map[0].length;j++) {
                if(map[i][j] > 0) {
                    g.setColor(new Color(0xB700FF)); // brick color
                    g.fillRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(4));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight);
                }
            }

        }
    }

    // this sets the value of brick to 0 if it is hit by the ball
    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }

}