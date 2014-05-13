package com.meganexus.code.test1.solution;

public class TypeThreeBehaviour implements Behaviour{


    @Override
    public String doSomething() {

        return doSometingThree();
    }

    private String doSometingThree() {

        return "I'm type Three!";
    }
}
