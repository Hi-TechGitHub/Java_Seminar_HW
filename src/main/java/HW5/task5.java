package HW5;
import javax.sound.midi.Soundbank;
import java.util.*;
//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class task5 {
    public static void main(String[] args) {
        phones();
    }

    private static void phones() {
        List<String> names = new ArrayList<>();
        Map<String, ArrayList<String>> phones = new HashMap<>();
        phones.put("Макс", new ArrayList<String>(Arrays.asList("+7123232345", "+232171871")));
        phones.put("Егор", new ArrayList<String>(Arrays.asList("+723100", "+8121323")));
        phones.put("Арсений", new ArrayList<String>(Arrays.asList("+98012311", "+337123423")));
        phones.put("Николай", new ArrayList<String>(Arrays.asList("+342221234", "+1221342")));
        phones.put("Павел", new ArrayList<String>(Arrays.asList("+12331331", "+659843038")));
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Впишите имя пользователя или: выход");
            String command = in.nextLine();
            if (command.equals("выход")) {
                flag = false;
            }
            System.out.println(phones.get(command));
        }
    }
}



