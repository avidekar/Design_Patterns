/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author avidekar
 */
public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("CIRCLE"); //s1 is now a circle object
        Shape s2 = shapeFactory.getShape("RECTANGLE"); //s2 is now a rectangle object
        Shape s3 = shapeFactory.getShape("SQUARE"); //s3 is now a square object
        
        s1.draw();
        s2.draw();
        s3.draw();
    }
    
}
