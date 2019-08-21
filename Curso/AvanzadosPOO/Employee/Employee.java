/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Alumno
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary(){
        return salary * 12;
    }
    public int raiseSalary(int percent){
        int aumento = this.salary * percent/100;
        this.salary += aumento;
        return salary;
    }
    @Override
    public String toString(){
        return "ID: " + this.id + "\nName: " + this.firstName + " " + this.lastName + "\nSalary: " + this.salary;
    }
}
