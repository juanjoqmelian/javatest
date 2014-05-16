package com.meganexus.code.codingtests.test1.solution;

public class NumberProcessorSolution {


    public String process(String type) {

        Behaviour behaviour = BehaviourFactory.getBehaviour(type);

        return behaviour.doSomething();
    }
}
