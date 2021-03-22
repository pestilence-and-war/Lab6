import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Master
 */
public class Employee {
    private String name;
    private String idNumber;
    private String department;
    private String position;

    public Employee(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    
    public Employee(String name, String idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public Employee() {
        this.name = "";
        this.idNumber = "0";
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
   
    
    public static void main(String[] args) {
        Employee Susan = new Employee("Susan Meyers", "47899", "Accounting", "Vice President");
        Employee Mark = new Employee("Mark Jones", "39119", "IT", "Programmer");
        Employee Rogers = new Employee("Joy Rogers","81774","Manufacturing", "Engineer");
        ArrayList<String> SusanRecord = new ArrayList();
        ArrayList<String> MarkRecord = new ArrayList();
        ArrayList<String> RogersRecord = new ArrayList();
        SusanRecord.add(Susan.name);
        SusanRecord.add(Susan.idNumber);
        SusanRecord.add(Susan.department);
        SusanRecord.add(Susan.position);
        MarkRecord.add(Mark.name);
        MarkRecord.add(Mark.idNumber);
        MarkRecord.add(Mark.department);
        MarkRecord.add(Mark.position);
        RogersRecord.add(Rogers.name);
        RogersRecord.add(Rogers.idNumber);
        RogersRecord.add(Rogers.department);
        RogersRecord.add(Rogers.position);
        System.out.println(SusanRecord.toString());
        System.out.println(MarkRecord.toString());
        System.out.println(RogersRecord.toString());
       
    }
   
    
    
}
