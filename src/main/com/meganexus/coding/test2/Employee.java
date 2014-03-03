package com.meganexus.coding.test2;


public class Employee {

    private String firstName;

    private String lastName;

    private Nationality nationality;

    private Float salary;

    private Employee(String firstName, String lastName, Nationality nationality, Float salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.salary = salary;
    }

    public static final Employee instanceOf(String firstName, String lastName, Nationality nationality, Float salary) {

        return new Employee(firstName, lastName, nationality, salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
