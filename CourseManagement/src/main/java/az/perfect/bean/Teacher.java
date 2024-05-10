/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author Perfect
 */
public class Teacher extends Person{
    private String groupName;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, String surname, int age,String groupName, double salary) {
        super(name, surname, age);
        this.groupName = groupName;
        this.salary = salary;
    }
    
    

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", groupName=" + groupName + ", salary=" + salary ;
    }
    
}
