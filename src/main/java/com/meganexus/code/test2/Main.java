package com.meganexus.code.test2;


public class Main {


    public static void main(String[] args) {

        final EmployeeService employeeService = new DefaultEmployeeService();

        System.out.println("Amount expended on salaries: " + employeeService.calculate());

        System.out.println("The number of employees from Spain is: " + employeeService.getEmployees(Nationality.SPANISH));


    }
}
