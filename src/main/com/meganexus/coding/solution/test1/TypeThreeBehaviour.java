package com.meganexus.coding.solution.test1;

public class TypeThreeBehaviour implements Behaviour{


    @Override
    public void doSomething() {

        doSometingThree();
    }

    private void doSometingThree() {

        System.out.println("I'm type Three!");
    }
}
