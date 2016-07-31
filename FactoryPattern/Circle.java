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
public class Circle implements Shape{
    
    void Circle()
    {
        System.out.println("Object created!");
    }
    
    public void draw()
    {
      System.out.println("Inside Circle: draw() method!");
    }
}