package com.meganexus.code.test1.solution;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.hamcrest.CoreMatchers.is;
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

        String expectedOutput = "I'm type One!\r\n" +
                "I'm type Two!\r\n" +
                "I'm type Three!\r\n" +
                "I'm type Four!\r\n" +
                "I'm type Five!\r\n" +
                "I'm type Six!\r\n";

        MainSolution.main(null);
        assertThat(output.getLog(), is(expectedOutput));
    }
}
