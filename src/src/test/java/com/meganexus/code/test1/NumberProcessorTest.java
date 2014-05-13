package com.meganexus.code.test1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class NumberProcessorTest {

    private final NumberProcessor numberProcessor = new NumberProcessor();


    @Test
    public void process_shouldPrintTypeOneMessage() throws Exception {

        String expectedMessage = "I'm type One!";

        String message = numberProcessor.process("ONE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeTwoMessage() {

        String expectedMessage = "I'm type Two!";

        String message = numberProcessor.process("TWO");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeThreeMessage() {

        String expectedMessage = "I'm type Three!";

        String message = numberProcessor.process("THREE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeFourMessage() {

        String expectedMessage = "I'm type Four!";

        String message = numberProcessor.process("FOUR");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeFiveMessage() {

        String expectedMessage = "I'm type Five!";

        String message = numberProcessor.process("FIVE");
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void process_shouldPrintTypeSixMessage() {

        String expectedMessage = "I'm type Six!";

        String message = numberProcessor.process("SIX");
        assertThat(message, is(expectedMessage));
    }
}
