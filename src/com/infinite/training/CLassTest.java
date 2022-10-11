package com.infinite.training;

import java.util.ArrayList;
import java.util.Scanner;

public class CLassTest {

}
class Employee{

    String empId;
    String empName;
    String empAge;
    String empAddress;
    String empDepartment;

    public Employee(int i, String john, double v) {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empAge='" + empAge + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }

}

class Department{
    String departmentName;
    int departmentId;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        EmployeeTest employeeTest= new EmployeeTest();
        Employee[] employees = new Employee[10];
        for(int i=0;i<=9;i++) {
            employees[i] = new Employee(i,"vishnu",2.5f);
            employeeTest.func(employees[i]);

        }

    }

     void func(Employee emp1) {
         setData(emp1);
        getData(emp1);
    }

    void setData(Employee emp1) {
        Scanner sc= new Scanner(System.in);

        String id=sc.next();
        String name=sc.next();
        String age=sc.next();
        String address=sc.next();
        String department=sc.next();


        emp1.setEmpId(id);
        emp1.setEmpName(name);
        emp1.setEmpAge(age);
        emp1.setEmpAddress(address);
        emp1.setEmpDepartment(department);

    }

    void getData(Employee emp1) {
        System.out.println("emp1 name  " + emp1.getEmpName());
        System.out.println("emp1 age " + emp1.getEmpAge());
        System.out.println("emp1 address" + emp1.getEmpAddress());
        System.out.println("emp1 department " + emp1.getEmpDepartment());
    }
}