package org.example;
//Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 7, 11, 28};
        findMaxAndMin(array);

    }

    private static void findMaxAndMin(int[] array) {
        int min = 10;
        int max = 0;
        for (int i : array) {
            if(max < i) {
                max = i;
            }
            if(min > i) {
                min = i;
            }
        }
        System.out.println("Максимальное число это: " + max + ", Минимальное число это: " + min);
    }
}