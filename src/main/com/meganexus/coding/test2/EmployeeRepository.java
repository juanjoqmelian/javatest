package com.meganexus.coding.test2;


import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {


    private static final List<Employee> employees;

    static {

        employees = new ArrayList<>();
        employees.add(Employee.instanceOf("John", "Carter", Nationality.BRITISH, 25000.0f));
        employees.add(Employee.instanceOf("Pedro", "Sanchez", Nationality.SPANISH, 26500.0f));
        employees.add(Employee.instanceOf("Rene", "Delon", Nationality.FRENCH, 24000.5f));
        employees.add(Employee.instanceOf("Michael", "Schumacher", Nationality.GERMAN, 1250000f));
        employees.add(Employee.instanceOf("Stefanos", "Papadopoulos", Nationality.GREEK, 31040.0f));
        employees.add(Employee.instanceOf("Jorge", "Castillo", Nationality.SPANISH, 34000.0f));
        employees.add(Employee.instanceOf("Luca", "Toni", Nationality.ITALIAN, 47050.9f));
        employees.add(Employee.instanceOf("Michael", "Johnson", Nationality.BRITISH, 51005.80f));
        employees.add(Employee.instanceOf("Rafael", "Rodriguez", Nationality.SPANISH, 21000.0f));
        employees.add(Employee.instanceOf("Giuseppe", "Lombardi", Nationality.ITALIAN, 23500.0f));
    }

    public List<Employee> getEmployees() {

        return employees;
    }
}
