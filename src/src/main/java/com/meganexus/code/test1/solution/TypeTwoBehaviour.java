package com.meganexus.code.test1.solution;

public class TypeTwoBehaviour implements Behaviour{


    @Override
    public String doSomething() {

        return doSomethingTwo();
    }

    private String doSomethingTwo() {

        return "I'm type Two!";
    }
}
