import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // Оголошення змінних
        long l = 123456L;
        double d1, d2;
        float f = 14.75f;
        char c1 = '0';

        // Виведення початкових значень на екран
        System.out.println("Початкові значення:");
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("c1 = " + c1);

        // Привласнення значення змінної f змінній l
        l = (long) f;

        // Генерація випадкового значення для d1 в діапазоні від 100 до 1000
        Random random = new Random();
        d1 = 100 + random.nextDouble() * 900;

        // Генерація випадкового значення для d2 в діапазоні від 1 до 99
        d2 = 1 + random.nextDouble() * 98;

        double res1 = Math.ceil(d1);
        double res2 = Math.ceil(d2);

        // Виведення результатів на екран
        System.out.println("\nРезультати операцій:");
        System.out.println("l (після привласнення f) = " + l);
        System.out.println("d1 (випадкове значення від 100 до 1000) = " + res1);
        System.out.println("d2 (випадкове значення від 1 до 99) = " + res2);
    }
}