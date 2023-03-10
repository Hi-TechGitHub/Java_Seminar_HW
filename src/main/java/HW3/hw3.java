package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class hw3 {
    public static void main(String[] args) {
        removePariry();
    }

    private static void removePariry() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size list: ");
        int size = in.nextInt();
        List<Integer> a = new ArrayList<Integer>() {
        };
        for (int i = 0; i < size; i++) {
            System.out.println("Write a element with index " + i + ": ");
            int temp = in.nextInt();
            a.add(temp);
        }
        System.out.println(a);
        for (int i = 0; i < a.size(); i++) {
            int check = a.get(i) % 2;
            if (check == 0) {
                a.remove(i);
            }
        }
        System.out.println(a);
    }
}
