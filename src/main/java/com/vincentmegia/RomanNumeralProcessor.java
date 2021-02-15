package com.vincentmegia;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralProcessor {
    private Map<String, Integer> map = new HashMap<>();

    public RomanNumeralProcessor() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("C", 100);
    }

    /**
     * Pre condition strings are valid
     * @param text
     * @return
     */
    public long process(String text) {
        //parsing
        var tokens = text.split("");
        var counter = 0;
        //XVIII
        //IV
        for (int i = 0; i < tokens.length; i++) {
            if (i == tokens.length - 1) {
                counter += map.get(tokens[i]);
            } else if (map.get(tokens[i]) >= map.get(tokens[i + 1])) {
                counter += map.get(tokens[i]);
            } else {
                counter -= map.get(tokens[i]);
            } if (i + 1 >= tokens.length) break;
        }
        return counter; //default
    }
}
