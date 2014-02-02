package com.meganexus.coding.solution.test1;

import java.util.List;

public class Test1Solution {

    private Behaviour behaviour;

    public void processAll(List<String> types) {

        for(String type : types) {
            this.process(type);
        }
    }

    public void process(String type) {

        behaviour = BehaviourFactory.getBehaviour(type);

        behaviour.doSomething();
    }

}
