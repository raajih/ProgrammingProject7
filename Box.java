//Raajih Roland
//Program Project 7

import java.awt.*;

public class Box extends Shape{

	//Constructor
	public Box(Point p1, Point p2, Color color) 
	{
        super(p1, p2, color);
    }

    
    public void draw(Graphics g)
    {
        //Use methods from super class to get P1 and P2
        Point newP1 = getP1();
        Point newP2 = getP2();
        Color newColor = getColor();

        //Calc width and height of rect plus x and y
        int x = Math.min(newP1.x, newP2.x);
        int y = Math.min(newP1.y, newP2.y);
        int width = Math.abs(newP1.x - newP2.x);
        int height = Math.abs(newP1.y - newP2.y);

        // Set the color and draw the rectangle
        g.setColor(newColor);
        g.drawRect(x, y, width, height);

    }
}
