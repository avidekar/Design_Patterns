/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author avidekar
 */
public class SingleObject {
    //object of singleobject created
    private static SingleObject instance = new SingleObject();
    
    private SingleObject()
    {
        //private constructor so that other objects canot be created
    }
    
    //get the only object available
    public static SingleObject getInstance()
    {
        return instance;
    }
    
    public void showMessage()
    {
        System.out.println("Hello World!");
    }
}
