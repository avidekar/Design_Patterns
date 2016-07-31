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
public class Rectangle implements Shape{
    
    void Rectangle()
    {
        System.out.println("Object created!");
    }
    public void draw()
    {
      System.out.println("Inside Rectangle: draw() method!");
    }
}
