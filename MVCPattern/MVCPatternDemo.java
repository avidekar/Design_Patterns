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
public class MVCPatternDemo {
    
    public static void main(String[] args) 
    {
        //fetch student record based on his rollno from database
        Student model = retriveStudentFromDatabase();
        
        //Create a view:to write student details into console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("AJ");
        controller.updateView();
        
        
    }
    
    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Ajay");
        student.setRollNo("500852");
        return student;
    }
}
