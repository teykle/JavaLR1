import java.util.Scanner;

public class JavaLR5 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != 'e') && (s.charAt(i) != 'o')) {
                continue;
            }
            s.setCharAt(i, '_');
        }
        System.out.println("Заміна символів 'e' та 'o' на '_':");
        System.out.println(s);

        System.out.println("\nТаблиця значень функції:");
        System.out.println("x\t|\ty");
        System.out.println("---------------------");

        for (double x = -4.5; x <= 4.5; x += 0.5) {
            double y;

            if (x == 0) {
                System.out.println(x + "\t|\tФункція не визначена");
                continue;
            }

            y = (x - 5) * (x + 5) / x;

            System.out.println(x + "\t|\t" + y);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведіть цілі числа. Введіть 0 для завершення вводу.");

        int product = 1;
        int input;

        do {
            System.out.print("Введіть число: ");
            input = scanner.nextInt();

            if (input != 0) {
                product *= input;
            }
        } while (input != 0);

        System.out.println("Добуток введених чисел: " + product);

        scanner.close();
    }
}
