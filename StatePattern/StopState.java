/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author avidekar
 */
public class StopState implements State{
    
    public void doAction(Context context)
    {
        System.out.println("Player is in Stop State");
        context.setState(this);
    }
    
    public String toString()
    {
        return "Stop State";
    }
    
}
