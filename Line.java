//Raajih Roland
//Program Project 7

import java.awt.*;

public class Line extends Shape{

	//Constructor
	public Line(Point p1, Point p2, Color color) 
	{
        super(p1, p2, color);
	}
	
	/**
	 * @param g
	 */
	public void draw(Graphics g)
	{
		Point newP1 = getP1();
		Point newP2 = getP2();
		Color newColor = getColor();

		//set color and draw line
		g.setColor(newColor);
		g.drawLine(newP1.x, newP1.y, newP2.x, newP2.y);
	}
}
