package HW2;
//Напишите метод, который составит строку,
//состоящую из 100 повторений слова TEST и метод,
//который запишет эту строку в простой текстовый файл,
//обработайте исключения.
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class HW2 {
    public static void main(String[] args) {
        writerFile();
    }
    private static void writerFile() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 100 + 1; i++) {
            sb.append(" TEST " );
        }
        try(PrintWriter pw = new PrintWriter("G:\\JavaHomeWorks\\GB_Java_seminars\\src\\main\\resources\\files\\file.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
