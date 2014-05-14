package com.meganexus.code.examples;

import com.meganexus.code.examples.exception.SmtpServerNotStarted;import com.meganexus.code.resources.SmtpServer;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 14/05/14
 */
public class EmailSender {

    private final String from;

    private final SmtpServer smtpServer;


    public EmailSender(String from) {

        smtpServer = new SmtpServer();
        this.from = from;
    }


    public void send(String to, String message) throws SmtpServerNotStarted {

        if (!this.smtpServer.isStarted()) {
            throw new SmtpServerNotStarted("Smtp server must be started to send an email!");
        }

        if (to == null || to.equals("")) {
            throw new IllegalArgumentException("You must introduce an addressee!");
        }

        String emailTemplate = "Email has been sent to %s with the following content : %s";

        System.out.println(String.format(emailTemplate, to, message));
    }

    public SmtpServer getSmtpServer() {

        return smtpServer;
    }
}
