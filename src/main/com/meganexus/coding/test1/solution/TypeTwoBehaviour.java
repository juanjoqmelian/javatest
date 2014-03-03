package com.meganexus.coding.test1.solution;

public class TypeTwoBehaviour implements Behaviour{


    @Override
    public void doSomething() {

        doSomethingTwo();
    }

    private void doSomethingTwo() {

        System.out.println("I'm type Two!");
    }
}
