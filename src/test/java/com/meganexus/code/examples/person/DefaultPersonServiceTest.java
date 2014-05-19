package com.meganexus.code.examples.person;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 19/05/14
 */
public class DefaultPersonServiceTest {

    private DefaultPersonService defaultPersonService;

    private PersonRepository mockPersonRepository;


    public DefaultPersonServiceTest() {

        defaultPersonService = new DefaultPersonService();
        mockPersonRepository = mock(PersonRepository.class);
        defaultPersonService.setPersonRepository(mockPersonRepository);
    }

    @Test
    public void findWithAgeEqualOrGreaterThan_shouldReturnAListOfPeopleOlderThanAGivenAge() {

        final Integer adultAge = 18;

        List<Person> adultPeople = new ArrayList<Person>();
        Person adult1 = new Person("", "", 18, "London", "W2 3QH");
        Person adult2 = new Person("", "", 33, "London", "W2 3QH");
        adultPeople.add(adult1);
        adultPeople.add(adult2);

        when(mockPersonRepository.getPeople()).thenReturn(adultPeople);

        List<Person> returnPeople = defaultPersonService.findWithAgeEqualOrGreaterThan(adultAge);

        verify(mockPersonRepository, times(1)).getPeople();
        verifyNoMoreInteractions(mockPersonRepository);

        assertThat(returnPeople, everyItem(olderThan(adultAge)));
    }


    private TypeSafeMatcher<Person> olderThan(final Integer adultAge) {

        return new TypeSafeMatcher<Person>() {
            @Override
            protected boolean matchesSafely(Person item) {

                return item.getAge() >= adultAge;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("Someone in the list is younger than the given age!");
            }
        };
    }
}
