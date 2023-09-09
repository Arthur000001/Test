package org.example.interviews.leetcode.task3;

import java.util.Objects;
import java.util.stream.Collectors;

public class CharacterСounting {

    public static void start() {
        String seq = "ABBBCDDDBB";
        System.out.println(variant1(seq));
        System.out.println(variant2(seq));
    }

    public static String variant2(String seq) {
        return seq.chars()
                .mapToObj(el -> (char)el)
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .map(entry -> entry.getValue().toString() + entry.getKey())
                .collect(Collectors.joining())
                .replace("1", "");
    }

    public static String variant1(String seq) {
        String result = "";
        char charSeq = seq.charAt(0);
        int counterChar = 1;
        for (int i = 1; i < seq.length(); i++) {
            if (charSeq == seq.charAt(i)) {
                counterChar++;
            } else {
                if (counterChar != 1) {
                    result = result + counterChar + charSeq;
                } else {
                    result = result + charSeq;
                }
                counterChar = 1;
                charSeq = seq.charAt(i);
            }
        }

        if (counterChar != 1) {
            result = result + counterChar + charSeq;
        } else {
            result = result + charSeq;
        }

        return result;
    }
}

