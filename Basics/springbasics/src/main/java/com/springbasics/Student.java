package com.springbasics;

public class Student {

    private int studentID;
    private String studentName;
    private String studentAddress;

    public Student(int studentID, String studentName, String studentAddress) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    
    public Student() {
        super();
    }

    

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        System.out.println("Setting student ID to " + studentID);
        this.studentID = studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        System.out.println("Setting student name to " + studentName);
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting student address to " + studentAddress);
        this.studentAddress = studentAddress;
    }

    

    
}
