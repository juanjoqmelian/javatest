package com.meganexus.code.examples.person;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 19/05/14
 */
public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String town;
    private String postcode;


    public Person(String firstName, String lastName, Integer age, String town, String postcode) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
        this.postcode = postcode;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
