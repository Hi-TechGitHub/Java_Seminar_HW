package HW2;
//1. Напишите метод, который принимает на вход строку (String)
//и определяет является ли строка палиндромом (возвращает boolean значение).
// aba == aba
import java.util.Scanner;



public class HW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        String str = in.next();
        boolean palindrom = Palindrom(str);
        System.out.println(palindrom);
    }

    private static boolean Palindrom(String word) {
        int counter = 0;
        int i = 0;
        int j = word.length() - 1;
        char[] charArray = word.toCharArray();
        while(counter < word.length()) {
            counter++;
            if(charArray[i] == charArray[j]) {
                ++i;
                --j;
            } else {
                return false;
            }

        }
        return true;



    }

}
