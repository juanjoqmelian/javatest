package com.meganexus.code.resources;

import org.junit.rules.ExternalResource;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 14/05/14
 */
public class SmtpServerRule extends ExternalResource {

    private final SmtpServer smtpServer;


    public SmtpServerRule(SmtpServer smtpServer) {

        this.smtpServer = smtpServer;
    }


    @Override
    protected void before() throws Throwable {

        smtpServer.start();
    }

    @Override
    protected void after() {

        smtpServer.stop();
    }
}
