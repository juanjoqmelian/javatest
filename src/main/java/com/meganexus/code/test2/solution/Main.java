package com.meganexus.code.test2.solution;


import com.meganexus.code.test2.Nationality;

public class Main {


    public static void main(String[] args) {

        final EmployeeService employeeService = new DefaultEmployeeService();

        System.out.println("Amount expended on salaries: " + employeeService.calculateExpensesOnSalaries());

        System.out.println("The number of employees from Spain is: " + employeeService.getNumberOfEmployeesWhoseNationalityIs(Nationality.SPANISH));
    }
}
