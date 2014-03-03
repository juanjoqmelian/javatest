package com.meganexus.coding.test2;


public class DefaultEmployeeService implements EmployeeService{


    private final EmployeeRepository employeeRepository = new EmployeeRepository();

    /**
     * This method calculates the total expense on salaries by the company
     * @return
     */
    @Override
    public Float calculate(){
        //stores the expenses on salaries
        Float aux = 0.0f;
        for(Employee employee : employeeRepository.getEmployees()){
            aux = aux + employee.getSalary();
        }
        return aux;
    }

    /**
     * This method get the number of employees from a given country
     * @param nationality
     * @return
     */
    @Override
    public int getEmployees(Nationality nationality){
        //stores the number of employees
        int num=0;
        for (Employee employee : employeeRepository.getEmployees()){

            //if the employee's nationality matches
            if(employee.getNationality().equals(nationality))
                num++;
        }
        return num;
    }
}
