package com.meganexus.code.test1.solution;

import java.util.ArrayList;
import java.util.List;

public class MainSolution {

    public static void main(String[] args) {

        NumberProcessorSolution test1 = new NumberProcessorSolution();

        List<String> types = new ArrayList<String>();

        types.add("ONE");
        types.add("TWO");
        types.add("THREE");
        types.add("FOUR");
        types.add("FIVE");
        types.add("SIX");

        test1.processAll(types);
    }

}
