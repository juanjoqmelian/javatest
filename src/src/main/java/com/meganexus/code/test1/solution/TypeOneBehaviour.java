package com.meganexus.code.test1.solution;

public class TypeOneBehaviour implements Behaviour{


    @Override
    public String doSomething() {

        return doSomethingOne();
    }

    private String doSomethingOne() {

        return "I'm type One!";
    }
}
