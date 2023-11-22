import java.util.Scanner;

public class JavaLR3 {
    public static void main(String[] args) {

        System.out.println("Завдання 1: Вивід емоджі");
      Emoji();

        System.out.println("\nЗавдання 2: Визначення типу речення");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть речення для перевірки типу:");
        String sentence = scanner.nextLine();

        Type(sentence);
    }

    private static void Emoji() {
        char emoji1 = '\u263A';  // Обираємо емоджі за номером Unicode
        char emoji2 = '\u2665';
        char emoji3 = '\u2602';

        System.out.println("" + emoji1 + emoji2 + emoji3);
    }

    private static void Type(String sentence) {
        if (sentence.endsWith("!")) {
            System.out.println("Це окличне речення");
        } else if (sentence.endsWith("?")) {
            System.out.println("Це питальне речення");
        } else {
            System.out.println("Це інше речення.");
        }
    }
}

