package com.meganexus.code.codingtests.test1.solution;


import java.util.HashMap;
import java.util.Map;

public class AlternativeBehaviourFactory {

    private static Map<String, Behaviour> map = new HashMap<String, Behaviour>();

    static {

        map.put("ONE", new TypeOneBehaviour());
        map.put("TWO", new TypeTwoBehaviour());
        map.put("THREE", new TypeThreeBehaviour());
        map.put("FOUR", new TypeFourBehaviour());
        map.put("FIVE", new TypeFiveBehaviour());
        map.put("SIX", new TypeSixBehaviour());
    }

    public static Behaviour getBehaviour(String type){

        return map.get(type.toUpperCase());
    }
}
