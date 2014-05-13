package com.meganexus.code.test1.solution;

import java.util.List;

public class NumberProcessorSolution {

    private Behaviour behaviour;


    public void printAll(List<String> types) {

        for(String type : types) {
            System.out.println(this.process(type));
        }
    }

    public String process(String type) {

        behaviour = BehaviourFactory.getBehaviour(type);

        return behaviour.doSomething();
    }

}
