

import java.util.Scanner;

public class myCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите пункт");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Возведения в степень");
            System.out.println("6. Получение остатка от деления");
            System.out.println("7. Выйти");

            int person = scanner.nextInt();
            int result;

            if (person == 7) {
                break;
            } else if (person == 1) {
                    System.out.print("Введите первое число: ");
                    int a = scanner.nextInt();
                    System.out.print("Выберите второе число: ");
                    int b = scanner.nextInt();
                    result = a + b;
                    System.out.print("Ответ: " + result);
                    System.out.println();
            } else if (person == 2) {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Выберите второе число: ");
                int b = scanner.nextInt();
                result = a - b;
                System.out.print("Ответ: " + result);
                System.out.println();
            } else if (person == 3) {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Выберите второе число: ");
                int b = scanner.nextInt();
                result = a * b;
                System.out.print("Ответ: " + result);
                System.out.println();
            } else if (person == 4) {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Выберите второе число: ");
                int b = scanner.nextInt();
                try {
                    result = a / b;
                    System.out.println("Ответ: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка, на ноль делить нельзя :(");
                }
                System.out.println();
            } else if (person == 5) {
                System.out.print("Введите число: ");
                int a = scanner.nextInt();
                result = a * a;
                System.out.print("Ответ: " + result);
                System.out.println();
            }else if (person == 6) {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Выберите второе число: ");
                int b = scanner.nextInt();
                result = a % b;
                System.out.println("Остаток от деления равна: " + result);
                System.out.println();
            } else {
                System.out.println("Ошибка");
            }
        }
        System.out.println("Программа завершена");
    }
}