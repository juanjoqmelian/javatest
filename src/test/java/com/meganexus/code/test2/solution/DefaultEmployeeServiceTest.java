package com.meganexus.code.test2.solution;

import com.meganexus.code.test2.Employee;
import com.meganexus.code.test2.EmployeeRepository;
import com.meganexus.code.test2.Nationality;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEmployeeServiceTest {

    private DefaultEmployeeService defaultEmployeeService;

    private EmployeeRepository mockEmployeeRepository;


    public DefaultEmployeeServiceTest() {

        defaultEmployeeService = new DefaultEmployeeService();
        mockEmployeeRepository = mock(EmployeeRepository.class);
        defaultEmployeeService.setEmployeeRepository(mockEmployeeRepository);
    }


    private final static List<Employee> EMPLOYEES = new ArrayList<Employee>();

    @BeforeClass
    public static void setUp() {

        Employee employee1 = Employee.instanceOf("Juan", "Quintana", Nationality.SPANISH, 10000f);
        Employee employee2 = Employee.instanceOf("Chuck", "Norris", Nationality.AMERICAN, 200000f);
        EMPLOYEES.add(employee1);
        EMPLOYEES.add(employee2);
    }


    @Test
    public void calculateExpensesOnSalaries_shouldReturnTheAmountExpendedOnSalaries() throws Exception {

        when(mockEmployeeRepository.getEmployees()).thenReturn(EMPLOYEES);

        Float salaries = defaultEmployeeService.calculateExpensesOnSalaries();

        assertThat(salaries, is(210000f));
    }

    @Test
    public void calculateExpensesOnSalaries_shouldReturnZeroIfTheListIsEmpty() {

        when(mockEmployeeRepository.getEmployees()).thenReturn(new ArrayList<Employee>());

        Float salaries = defaultEmployeeService.calculateExpensesOnSalaries();

        assertThat(salaries, is(0.0f));
    }

    @Test
    public void getNumberOfEmployeesWhoseNationalityIs_shouldReturnNumberOfAmericanEmployees() throws Exception {

        when(mockEmployeeRepository.getEmployees()).thenReturn(EMPLOYEES);

        int numberOfAmericanEmployees = defaultEmployeeService.getNumberOfEmployeesWhoseNationalityIs(Nationality.AMERICAN);

        assertThat(numberOfAmericanEmployees, is(1));
    }

    @Test
    public void getNumberOfEmployeesWhoseNationalityIs_shouldReturnZeroIfListIsEmpty() {

        when(mockEmployeeRepository.getEmployees()).thenReturn(new ArrayList<Employee>());

        int numberOfEmployees = defaultEmployeeService.getNumberOfEmployeesWhoseNationalityIs(Nationality.SPANISH);

        assertThat(numberOfEmployees, is(0));
    }
}
