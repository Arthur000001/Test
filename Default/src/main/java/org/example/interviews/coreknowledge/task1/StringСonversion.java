package org.example.interviews.coreknowledge.task1;

import java.util.Map;
import java.util.stream.Collectors;

public class StringСonversion {
    private static final String INPUT_STRING = "EJKRIPGBWIECBEIRGBWKEJRBGIWII";

    public static void start() {
        System.out.println("[RESULT TASK 1]:");
        System.out.println(variant1(INPUT_STRING));
        System.out.println(variant2(INPUT_STRING));
        System.out.println(variant3("FIWBEIVOWEBFVBWEYRBCWJDEHVITW3VRUJHWETIRCVWHDEBVIUWRBDVEEXHBJNCIWEB"));
    }

    public static String variant3(String inputString) {
        return inputString.chars()
                .mapToObj(el -> (char)el)
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .map(el -> "(" + el.getKey() + "=" + el.getValue().toString() + ")")
                .collect(Collectors.joining(" "));
    }

    public static String variant2(String inputString) {
        return "[" + inputString.chars()
                .mapToObj(el -> (char)el)
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum))
                .entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", ")) + "]";
    }

    public static String variant1(String inputString) {
        Map<Character, Integer> chars = inputString.chars()
                .mapToObj(el -> (char)el)
                .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

        String result = chars.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining(", "));

        return "[" + result + "]";
    }
}
