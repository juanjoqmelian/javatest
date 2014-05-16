package com.meganexus.code.codingtests.test1.solution;

public class TypeThreeBehaviour implements Behaviour{


    @Override
    public String doSomething() {

        return doSomethingThree();
    }

    private String doSomethingThree() {

        return "I'm type Three!";
    }
}
