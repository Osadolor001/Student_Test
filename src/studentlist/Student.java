/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * This is for pull.....
 * Demo on fetch and merge
 */
package studentlist;

/**
 *
 * @author Ronak
 */
public class Student {
    
    private String studentId;
    private String studentName;
    private String address;
            
    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName=studentName;                
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
    
}
