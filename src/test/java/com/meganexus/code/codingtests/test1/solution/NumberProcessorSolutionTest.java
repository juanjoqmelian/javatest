package com.meganexus.code.codingtests.test1.solution;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 12/05/14
 */
public class NumberProcessorSolutionTest {

    private final NumberProcessorSolution numberProcessorSolution = new NumberProcessorSolution();


    @Test
    public void process_shouldPrintTypeOneMessage() throws Exception {

        String expectedMessage = "I'm type One!";

        String message = numberProcessorSolution.process("ONE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeTwoMessage() {

        String expectedMessage = "I'm type Two!";

        String message = numberProcessorSolution.process("TWO");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeThreeMessage() {

        String expectedMessage = "I'm type Three!";

        String message = numberProcessorSolution.process("THREE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeFourMessage() {

        String expectedMessage = "I'm type Four!";

        String message = numberProcessorSolution.process("FOUR");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeFiveMessage() {

        String expectedMessage = "I'm type Five!";

        String message = numberProcessorSolution.process("FIVE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeSixMessage() {

        String expectedMessage = "I'm type Six!";

        String message = numberProcessorSolution.process("SIX");
        assertThat(message, is(expectedMessage));
    }


}
