package com.meganexus.code.resources;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 14/05/14
 */
public class SmtpServer {

    private Boolean started = false;

    public void start() {

        this.started = Boolean.TRUE;
        System.out.println("Smtp server started!");
    }

    public void stop() {

        this.started = Boolean.FALSE;
        System.out.println("Smtp server stopped!");
    }

    public Boolean isStarted() {

        return started;
    }
}
