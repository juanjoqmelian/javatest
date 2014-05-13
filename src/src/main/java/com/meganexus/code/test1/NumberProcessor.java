package com.meganexus.code.test1;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {

    private List<String> types = new ArrayList<String>();

    public NumberProcessor() {

        types.add("ONE");
        types.add("TWO");
        types.add("THREE");
        types.add("FOUR");
        types.add("FIVE");
        types.add("SIX");
    }


    public void printAll() {

        for(String type : getTypes()) {

            String message = this.process(type);

            System.out.println(message);
        }
    }

    public String process(String type) {

        if(type.equals("ONE")) {

            return doSomethingOne();
        }else if (type.equals("TWO")) {

            return doSomethingTwo();
        }else if(type.equals("THREE")) {

            return doSomethingThree();
        }else if(type.equals("FOUR")) {

            return doSomethingFour();
        }else if(type.equals("FIVE")) {

            return doSomethingFive();
        }else if(type.equals("SIX")) {

            return doSomethingSix();
        }

        return "";
    }

    private String doSomethingOne() {

        return "I'm type One!";
    }

    private String doSomethingTwo() {

        return "I'm type Two!";
    }

    private String doSomethingThree() {

        return "I'm type Three!";
    }

    private String doSomethingFour() {

        return "I'm type Four!";
    }

    private String doSomethingFive() {

        return "I'm type Five!";
    }

    private String doSomethingSix() {

        return "I'm type Six!";
    }


    public List<String> getTypes() {
        return types;
    }
}
