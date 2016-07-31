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
public class StudentView {
    public void printStudentDetails(String studentName, String rollNo)
    {
        System.out.println("Student :");
        System.out.println("Student Name : "+studentName);
        System.out.println("Student Roll No. is : "+rollNo);
    }
}
