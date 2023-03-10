package HW3;

import java.util.ArrayList;


//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное ("числа??") и среднее арифметическое из этого списка.
public class hw3task2 {
    public static void main(String[] args) {
        mathOperations();
    }

    private static void mathOperations() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        int tempMin = 10;
        int tempMax = 0;
        int middle = 0;
        int check = 0;
        for (int i = 0; i < array.size(); i++) {
            if(tempMin > array.get(i)) {
                tempMin = array.get(i);
            }
            if(tempMax < array.get(i)) {
                tempMax = array.get(i);
            }
        }
        for (int j = 0; j < array.size(); j++) {
            middle += array.get(j);
            check = j;
        }
        middle = middle / check;
        System.out.println("Минимальное число в массиве это: " + tempMin);
        System.out.println("Максимальное число в массиве это: " + tempMax);
        System.out.println("Среднее арифметическое это: " + middle);
    }
}
