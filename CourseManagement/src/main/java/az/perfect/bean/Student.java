/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Perfect
 */
public class Student extends Person{
    private String groupName;
    private double scholarship;

    public Student() {
    }

    public Student(String name, String surname, int age,String groupName, double scholarship) {
        super(name, surname, age);
        this.groupName = groupName;
        this.scholarship = scholarship;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return super.toString() + ", groupName=" + groupName + ", scholarship=" + scholarship;
    }
    
    
}
