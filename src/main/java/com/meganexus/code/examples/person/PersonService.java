package com.meganexus.code.examples.person;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 19/05/14
 */
public interface PersonService {

    List<Person> findWithAgeEqualOrGreaterThan(Integer age);
}
