package org.example.coreone.inputoutput.exemple.Console;

public class Console {

    public static void start() {
        String login = Helper.getDataFromConsole(Constants.LOGIN);
        String password = Helper.getDataFromConsole(Constants.PASSWORD);
        Helper.printData(Constants.YOUR_LOGIN, login);
        Helper.printData(Constants.YOUR_PASSWORD, password);
    }
}