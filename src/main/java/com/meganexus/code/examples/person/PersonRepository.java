package com.meganexus.code.examples.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 19/05/14
 */
public class PersonRepository {

    private static final List<Person> people;

    static {

        people = new ArrayList<Person>();
        people.add(new Person("John", "Carter", 17, "London", "W2 3QH"));
        people.add(new Person("Nick", "Williams", 39, "London", "W1 7QL"));
        people.add(new Person("Charles", "Parker", 25, "London", "W2 3AS"));
        people.add(new Person("Stacy", "Chapman", 14, "London", "W2 3FD"));
        people.add(new Person("Peter", "Parker", 35, "New York", "NY 3ER"));
        people.add(new Person("Clark", "Kent", 33, "Metropolis", "MP 7QM"));
        people.add(new Person("James", "Howlett", 42, "N", "W2 3QH"));
        people.add(new Person("John", "Turturro", 51, "London", "W2 3QH"));
        people.add(new Person("Jesus", "Christ", 33, "Jerusalem", "W2 3QH"));
        people.add(new Person("Chuck", "Norris", 157, "Los Angeles", "LA145"));
    }

    public List<Person> getPeople() {

        return people;
    }
}
