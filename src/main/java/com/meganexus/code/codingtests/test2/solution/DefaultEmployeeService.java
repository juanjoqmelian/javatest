package com.meganexus.code.codingtests.test2.solution;


import com.meganexus.code.codingtests.test2.Employee;
import com.meganexus.code.codingtests.test2.EmployeeRepository;
import com.meganexus.code.codingtests.test2.Nationality;

public class DefaultEmployeeService implements EmployeeService {


    private EmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public Float calculateExpensesOnSalaries() {

        Float expensesOnSalaries = 0.0f;

        for (Employee employee : employeeRepository.getEmployees()) {

            expensesOnSalaries = expensesOnSalaries + employee.getSalary();
        }

        return expensesOnSalaries;
    }


    @Override
    public int getNumberOfEmployeesWhoseNationalityIs(Nationality nationality) {

        int numberOfEmployees = 0;

        for (Employee employee : employeeRepository.getEmployees()) {

            if (nationalityMatches(nationality, employee)) {

                numberOfEmployees++;
            }
        }

        return numberOfEmployees;
    }


    private boolean nationalityMatches(Nationality nationality, Employee employee) {

        return employee.getNationality().equals(nationality);
    }



    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
