/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

/**
 *
 * @author avidekar
 */
public class ShapeMaker {
    
    public Rectangle rectangle;
    public Circle circle;
    public Square square;
    
    public ShapeMaker()
    {
        rectangle = new Rectangle();
        circle = new Circle();
        square = new Square();
    }
    
    public void drawRectangle()
    {
        rectangle.draw();
    }
    
    public void drawCircle()
    {
        circle.draw();
    }
    
    public void drawSquare()
    {
        square.draw();
    }
}
