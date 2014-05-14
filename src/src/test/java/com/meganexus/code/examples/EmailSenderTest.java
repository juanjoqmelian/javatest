package com.meganexus.code.examples;

import com.meganexus.code.examples.exception.SmtpServerNotStarted;
import com.meganexus.code.resources.SmtpServerRule;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 14/05/14
 */
public class EmailSenderTest {

    private static final String SENDER = "juan.quintana@meganexus.com";

    private static final EmailSender emailSender = new EmailSender(SENDER);

    @ClassRule
    public static final SmtpServerRule smtpServerRule = new SmtpServerRule(emailSender.getSmtpServer());


    @Rule
    public final StandardOutputStreamLog output = new StandardOutputStreamLog();

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();



    @Test
    public void send_shouldSendAnEmail() throws SmtpServerNotStarted {

        String expectedOutput = "Email has been sent to info@meganexus.com with the following content : This is a green test!";

        emailSender.send("info@meganexus.com", "This is a green test!");
        assertThat(output.getLog(), startsWith(expectedOutput));
    }

    @Test(expected = IllegalArgumentException.class)
    public void send_shouldThrowIllegalArgumentException() throws SmtpServerNotStarted {

        emailSender.send("", "This is a failing test!");
    }

    @Test
    public void send_shouldThrowIllegalArgumentExceptionWithSpecificErrorMessage() throws SmtpServerNotStarted {

        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("");

        emailSender.send("", "This is a failing test!");
    }
}
