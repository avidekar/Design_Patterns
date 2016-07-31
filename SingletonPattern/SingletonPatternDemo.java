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
public class SingletonPatternDemo {
    public static void main(String[] args) 
    {
    /*the below line cannot be executed and will an error because the 
    constructor is private*/
    
    //SingleObject singleObject = new SingleObject();
    SingleObject object = SingleObject.getInstance();
    object.showMessage();
    }
}
