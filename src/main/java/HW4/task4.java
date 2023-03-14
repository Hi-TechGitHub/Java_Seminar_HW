//1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
package HW4;

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        ex1();
    }
    private static void ex1() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordsList = new LinkedList<>();
        System.out.print("Введите количевство элементов: ");
        int size = in.nextInt();
        for (int i = 0; i <= size; i++) {
            String word = in.nextLine();
            wordsList.add(word);
        }


        while (true) {

            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

//            if (inputString.trim().length() == 0) {
            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("каша не вари")) {
                break;
            }
            if (inputString.equalsIgnoreCase("print")) {
                int  negativeI = wordsList.size();
                for (int i = 0; i < wordsList.size(); i++) {
                    negativeI--;
                    System.out.printf("%d) %s%n", i + 1, wordsList.get(negativeI));
                }
            }
            if (inputString.equalsIgnoreCase("revert")) {
                int index = wordsList.size() - 1;
                wordsList.remove(index);
                System.out.println("Элемент был удалён");
            }
            if (inputString.equalsIgnoreCase("exit")) {
                break;
            }
            if (!inputString.contains("\\~")) {
                continue;
            }

            String[] parts = inputString.split("~");
            String word = parts[0];
            int num = 0;

            try {
                num = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Выражение не содержит числа");
                continue;
            }

            if (num < 0 || num > wordsList.size() + 1) {
                System.out.println("Число должно быть в пределах списка от 1 до " + (wordsList.size() + 1));
                continue;
            }

            if (word.equalsIgnoreCase("print")) {
                System.out.printf("Под номером %d находится слово: %s%n", num, wordsList.get(num - 1));
                wordsList.remove(num - 1);
            } else if (num == wordsList.size() + 1) {
                wordsList.add(word);
                System.out.printf("Слово %s добавлено на позицию %d%n", word, num);
            } else {
                String oldWord = wordsList.get(num - 1);
                wordsList.set(num - 1, word);
                System.out.printf("Слово %s заменило на позиции %d слово %s%n", word, num, oldWord);
            }
        }
    }
}
