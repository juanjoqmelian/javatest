package com.meganexus.coding.solution.test1;

import java.util.ArrayList;
import java.util.List;

public class MainSolution {

    public static void main(String[] args) {

        Test1Solution test1 = new Test1Solution();

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
