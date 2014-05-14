package com.meganexus.code.test1.solution;

public class TypeFourBehaviour implements Behaviour{

    @Override
    public String doSomething() {

        return doSomethingFour();
    }

    private String doSomethingFour() {

        return "I'm type Four!";
    }
}
