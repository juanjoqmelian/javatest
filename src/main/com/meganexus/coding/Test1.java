package com.meganexus.coding;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    private List<String> types = new ArrayList<String>();

    public Test1() {

        types.add("ONE");
        types.add("TWO");
        types.add("THREE");
        types.add("FOUR");
        types.add("FIVE");
        types.add("SIX");
    }


    public void processAll() {

        for(String type : getTypes()) {

            this.process(type);
        }
    }

    public void process(String type) {

        if(type.equals("ONE")) {

            doSomethingOne();
        }else if (type.equals("TWO")) {

            doSomethingTwo();
        }else if(type.equals("THREE")) {

            doSomethingThree();
        }else if(type.equals("FOUR")) {

            doSomethingFour();
        }else if(type.equals("FIVE")) {

            doSomethingFive();
        }else if(type.equals("SIX")) {

            doSomethingSix();
        }

    }

    private void doSomethingOne() {

        System.out.println("I´m type One!");
    }

    private void doSomethingTwo() {

        System.out.println("I´m type Two!");
    }

    private void doSomethingThree() {

        System.out.println("I´m type Three!");
    }

    private void doSomethingFour() {

        System.out.println("I´m type Four!");
    }

    private void doSomethingFive() {

        System.out.println("I´m type Five!");
    }

    private void doSomethingSix() {

        System.out.println("I´m type Six!");
    }


    public List<String> getTypes() {
        return types;
    }
}
