package com.meganexus.code.codingtests.test1.solution;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: juan.quintana
 * Date: 13/05/14
 */
public class ConsoleOutput {

    private final NumberProcessorSolution numberProcessorSolution = new NumberProcessorSolution();


    public void printAll(List<String> types) {

        for (String type : types) {
            System.out.println(numberProcessorSolution.process(type));
        }
    }
}
