package com.meganexus.code.examples.exception;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 14/05/14
 */
public class SmtpServerNotStarted extends Exception {

    public SmtpServerNotStarted(String message) {
        super(message);
    }
}
