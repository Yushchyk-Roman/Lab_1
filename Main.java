package com.example.fibonacci;

import com.example.fibonacci.FibonacciNumber;
import com.example.fibonacci.InequalityResult;

import java.util.Scanner;

/**
 * Основний клас для запуску програми.
 * <p>
 * Програма обчислює число Фібоначчі F(n + 2) та перевіряє нерівність F(n + 2) < 2^n.
 * Користувач може ввести значення n через консоль або як аргумент командного рядка.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;


        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {

            while (true) {
                System.out.println("Введіть значення N: ");
                try {
                    n = scanner.nextInt();
                    if (n < 0) {
                        System.out.println("Було введено некоректне значення. n не може бути менше 0.");
                    } else {
                        break;
                    }
                } catch (Exception a) {
                    System.out.println("Некоректне введення. Будь ласка, введіть ціле число.");
                    scanner.next();
                }
            }
        }


        FibonacciNumber fibnum = new FibonacciNumber(n + 2);
        System.out.println("Значення F(" + fibnum.getIndex() + ") = " + fibnum.getValue());

        int powerOfTwo = (int) Math.pow(2, n);
        System.out.println("Значення 2^" + n + " = " + powerOfTwo);

        InequalityResult result = new InequalityResult(fibnum, powerOfTwo);

        result.printResult();

        scanner.close();
    }
}
