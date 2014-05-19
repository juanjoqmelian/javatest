package com.meganexus.code.examples.person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 19/05/14
 */
public class DefaultPersonService implements PersonService {

    private PersonRepository personRepository = new PersonRepository();


    @Override
    public List<Person> findWithAgeEqualOrGreaterThan(Integer age) {

        List<Person> people = new ArrayList<Person>();

        for (Person person : personRepository.getPeople()) {

            if (person.getAge() >= age) {
                people.add(person);
            }
        }

        return people;
    }


    public void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
