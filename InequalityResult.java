package com.example.fibonacci;

/**
 * Клас для перевірки та виведення результату нерівності виду:
 * <p>
 * F(n) < 2^(n - 2), де F(n) — число Фібоначчі.
 */
class InequalityResult {
    private FibonacciNumber fibonacciNumber;
    private boolean inequalityHolds;

    /**
     * Конструктор для перевірки нерівності F(n) < 2^(n - 2).
     * <p>
     * Перевіряє, чи виконується нерівність для заданого числа Фібоначчі
     * та відповідного степеня двійки.
     *
     * @param fib        Об'єкт {@link FibonacciNumber}, що містить число Фібоначчі.
     * @param powerOfTwo Значення степеня двійки, з яким порівнюється число Фібоначчі.
     */
    public InequalityResult(FibonacciNumber fib, int powerOfTwo) {
        this.fibonacciNumber = fib;
        this.inequalityHolds = fib.getValue() < powerOfTwo;
    }

    /**
     * Виводить результат перевірки нерівності.
     * <p>
     * Якщо нерівність виконується, виводиться повідомлення про те,
     * що число Фібоначчі менше за відповідний степінь двійки.
     * Інакше виводиться повідомлення про те, що нерівність не виконується.
     */
    public void printResult() {
        if (inequalityHolds) {
            System.out.println("Нерівність виконується: F(" + fibonacciNumber.getIndex() + ") < 2^" + (fibonacciNumber.getIndex() - 2));
        } else {
            System.out.println("Нерівність не виконується: F(" + fibonacciNumber.getIndex() + ") >= 2^" + (fibonacciNumber.getIndex() - 2));
        }
    }
}
