package org.example.core.inputoutput.exemple.Console;

import java.util.Scanner;

import static org.example.core.inputoutput.exemple.Console.Constants.securitySet;

public class Helper {
    public static boolean getCheckSecurityData(String security) {
        return securitySet.contains(security);
    }

    public static String getDataFromConsole(String comment) {
        Scanner in = new Scanner(System.in);
        System.out.print(comment + ": ");
        return in.nextLine();
    }

    public static void printData(String comment, String data) {
        System.out.println(comment + ": " + data);
    }
}
