package org.example;
//2. Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println(year());

    }
    public static boolean year()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int yearIn = in.nextInt();
        boolean isLeapYear = false;

        if(yearIn % 4 == 0) {
            isLeapYear = true;
        }
        if(yearIn % 100 == 0) {
            isLeapYear = false;
        }
        if(yearIn % 400 == 0) {
            isLeapYear = true;
        }


        return isLeapYear;


    }

}