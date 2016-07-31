/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCPattern;

/**
 *
 * @author avidekar
 */
public class Student {
    private String rollNo;
    private String name;
    
    // This class is the Model
    
    public String getRollNo()
    {
        return this.rollNo;
    }
    public void setRollNo(String rollNo)
    {
        this.rollNo = rollNo;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
