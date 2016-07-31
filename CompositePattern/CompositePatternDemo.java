/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

/**
 *
 * @author avidekar
 */
public class CompositePatternDemo {
    
    public static void main(String[] args) {
        
        Employee CEO = new Employee("Ajay Videkar","CEO",32000);
            
        Employee salesHead = new Employee("Kaushik Srivatsan","Sales Marketing",22000);
        
        Employee headMarketing = new Employee("Raj Adhiya","Marketing Head",12000);
        
        Employee clerk1 = new Employee("Pratham Vasa","Clerk",2000);
        
        Employee clerk2 = new Employee("Harsh Pandya","Clerk",7000);
        
        Employee salesExecutive1 = new Employee("Sourabh Dravid","Sales Executive",42000);
        
        Employee salesExecutive2 = new Employee("Pranay Bhandarkar","Sales Executive",42000);
        
        CEO.addEmployee(headMarketing);
        CEO.addEmployee(salesHead);
        
        salesHead.addEmployee(salesExecutive1);
        salesHead.addEmployee(salesExecutive2);
        
        headMarketing.addEmployee(clerk1);
        headMarketing.addEmployee(clerk2);
        
        System.out.println(CEO);
        
        for(Employee headEmployee : CEO.getSubordinates())
        {
            System.out.println(headEmployee);
        
        for(Employee employee : headEmployee.getSubordinates())
        {
            System.out.println(employee);
        }
        
    }
    }
}
