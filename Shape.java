//Raajih Roland
//Program Project 7

import java.awt.*;
import java.io.Serializable;

public abstract class Shape implements Serializable {
	private Point p1;
	private Point p2;
    private Color color;

    //Constructor
    public Shape(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    //Getters
    /**
     * 
     * @return point 1
     */
    public Point getP1() 
    { return p1; }
    /**
     * 
     * @return point 2
     */
    public Point getP2() 
    { return p2; }
    /**
     * 
     * @return color of shape
     */
    public Color getColor() 
    { return color; }

    //Setters
    /** 
    * @param point 1 to set
    */
    public void setP1(Point p1) 
    { this.p1 = p1; }
    /**
     *  
     * @param point 2 to set
     */
    public void setP2(Point p2) 
    { this.p2 = p2; }
    /**
     * 
     * @param color to set
     */
    public void setColor(Color color) 
    { this.color = color; }

    //Draw method
    /**
     * 
     * @param g
     */
    public abstract void draw(Graphics g);

	
}
