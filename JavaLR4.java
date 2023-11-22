import java.util.Scanner;

public class JavaLR4 {
    public static void main(String[] args) {
        // Задача 1: Обчислення виразу
        System.out.println("Задача 1: Обчислення виразу");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число X: ");
        int x = scanner.nextInt();

        double y;
        if (x < 0) {
            y = 3 * Math.pow(x, 3) - 12 * x + 4;
        } else if (x == 0) {
            y = 0;
        } else {
            y = (Math.pow(x, 4) - 11) * (Math.pow(x, 4) + 11) / Math.sqrt(x);
        }

        System.out.println("Результат обчислення: Y = " + y);

        // Задача 2: Привітання залежно від часу доби
        System.out.println("\nЗадача 2: Привітання залежно від часу доби");

        System.out.print("Введіть час у форматі \"година:хвилина\": ");
        String timeInput = scanner.next();

        // Розділення введеного часу на години та хвилини
        String[] timeParts = timeInput.split(":");
        int hour = Integer.parseInt(timeParts[0]);

        // Визначення години доби та виведення відповідного привітання
        if (hour < 12) {
            System.out.println("Добрий ранок");
        } else if (hour < 17) {
            System.out.println("Добрий день");
        } else if (hour < 22) {
            System.out.println("Добрий вечір");
        } else {23
            System.out.println("Добраніч");
        }

        // Закриваємо Scanner
        scanner.close();
    }
}
