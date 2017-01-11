// Write the code to draw a tower of blocks that looks like the one in the link below:
// http://i.imgur.com/PvIGJkL.png
    
// Name the class BlockTower. Each block has a width of 40 and a height of 30. 
// There are three rows. The upper left-hand corner of the bottom row is at (20, 70)

// Create a custom color for the topmost color where red = 125, green=125, blue = 255. 
// For all the other colors, use predefined colors. 
// The colors from top to bottom are: custom, RED, PINK, BLUE, MAGENTA, CYAN


// HINT:
// The bottom left rectangle should have the attributes:
// x: 20
// y: 70
// width: 40
// height: 30
//
// You should set the color of the rectangle to blue by using the method:
// setColor(Color.somecolor); on the rectangle object that you created
//
// Don't forget to draw the rectangle by calling the fill() function




public class BlockTower
{
    public static void main(String[] args)
    {
        Rectangle bottomLeft = new Rectangle(20, 70, 40, 30);
        Rectangle bottomMiddle = new Rectangle(60, 70, 40, 30);
        Rectangle bottomRight = new Rectangle(100, 70, 40, 30);
        Rectangle middleLeft = new Rectangle(40, 40, 40, 30);
        Rectangle middleRight = new Rectangle(80, 40, 40, 30);
        Rectangle top = new Rectangle(60, 10, 40, 30);
        bottomLeft.setColor(Color.BLUE);
        bottomLeft.fill();
        bottomMiddle.setColor(Color.MAGENTA);
        bottomMiddle.fill();
        bottomRight.setColor(Color.CYAN);
        bottomRight.fill();
        middleLeft.setColor(Color.RED);
        middleLeft.fill();
        middleRight.setColor(Color.PINK);
        middleRight.fill();
        top.setColor(new Color(125, 125, 255));
        top.fill();
        //TODO finish the draft to display the six blocks
    }
}
