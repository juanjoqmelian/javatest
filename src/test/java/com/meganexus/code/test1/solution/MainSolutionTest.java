package com.meganexus.code.test1.solution;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 13/05/14s.
 */
public class MainSolutionTest {

    @Rule
    public final StandardOutputStreamLog output = new StandardOutputStreamLog();


    @Test
    public void main_shouldPrintAllMessages() throws Exception {

        String messageOne = "I'm type One!";
        String messageTwo = "I'm type Two!";
        String messageThree = "I'm type Three!";
        String messageFour = "I'm type Four!";
        String messageFive = "I'm type Five!";
        String messageSix = "I'm type Six!";

        MainSolution.main(null);

        assertThat(output.getLog(), containsString(messageOne));
        assertThat(output.getLog(), containsString(messageTwo));
        assertThat(output.getLog(), containsString(messageThree));
        assertThat(output.getLog(), containsString(messageFour));
        assertThat(output.getLog(), containsString(messageFive));
        assertThat(output.getLog(), containsString(messageSix));
    }
}
