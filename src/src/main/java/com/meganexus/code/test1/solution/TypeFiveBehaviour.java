package com.meganexus.code.test1.solution;

public class TypeFiveBehaviour implements Behaviour{

    @Override
    public String doSomething() {

        return doSomethingFive();
    }

    private String doSomethingFive() {

        return "I'm type Five!";
    }
}
