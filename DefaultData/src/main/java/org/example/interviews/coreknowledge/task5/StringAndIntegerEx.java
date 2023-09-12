package org.example.interviews.coreknowledge.task5;

public class StringAndIntegerEx {
    public static void start() {

        String str1 = "Petr1";
        String str2 = "Petr1";
        System.out.print((str1.equals(str2)) + "|");//true - Потому что в переменную загрузились данные из poolInteger
        System.out.print((str1 == str2) + "|");//true - Потому что в переменную загрузились данные из poolInteger

        System.out.println();

        String str3 = new String("Petr2");
        String str4 = new String("Petr2");
        System.out.print((str3.equals(str4)) + "|");//true - Потому что сравнивает состояние
        System.out.print(str3 == str4);//false - Потому что сравнивает разные объекты

        System.out.println();

        Integer int1 = 1;
        Integer int2 = 1;
        System.out.print(int1.equals(int2) + "|");//true - Потому что в переменную загрузились данные из poolInteger
        System.out.print((int1 == int2) + "|");//true - Потому что в переменную загрузились данные из poolInteger

        System.out.println();

        Integer int3 = new Integer(2);
        Integer int4 = new Integer(2);
        System.out.print((int3.equals(int4)) + "|");//true - Потому что сравнивает состояние
        System.out.print(int3 == int4);//false - Потому что сравнивает разные объекты
    }
}
