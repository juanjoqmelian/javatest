package com.meganexus.coding.solution.test1;

public class TypeTwoBehaviour implements Behaviour{


    @Override
    public void doSomething() {

        doSomethingTwo();
    }

    private void doSomethingTwo() {

        System.out.println("I'm type Two!");
    }
}
