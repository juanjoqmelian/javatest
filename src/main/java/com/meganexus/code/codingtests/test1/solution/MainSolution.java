package com.meganexus.code.codingtests.test1.solution;

import java.util.ArrayList;
import java.util.List;

public class MainSolution {

    public static void main(String[] args) {

        ConsoleOutput consoleOutput = new ConsoleOutput();

        List<String> types = new ArrayList<String>();

        types.add("ONE");
        types.add("TWO");
        types.add("THREE");
        types.add("FOUR");
        types.add("FIVE");
        types.add("SIX");

        consoleOutput.printAll(types);
    }

}
