package com.example.fibonacci;

/**
 * Клас для представлення числа Фібоначчі за заданим індексом.
 * <p>
 * Він дозволяє обчислювати та отримувати значення числа Фібоначчі
 * на основі його порядкового індексу.
 */
class FibonacciNumber {
    private int index;
    private long value;

    /**
     * Конструктор, що обчислює N-те число Фібоначчі за заданим індексом.
     *
     * @param index Порядковий індекс числа Фібоначчі (починаючи з 0).
     */
    public FibonacciNumber(int index) {
        this.index = index;
        this.value = calculateFibonacci(index);
    }

    /**
     * Обчислює N-те число Фібоначчі.
     * <p>
     * Алгоритм використовує ітеративний підхід для уникнення переповнення
     * стека при великих значеннях N.
     *
     * @param n Індекс числа Фібоначчі, яке треба обчислити.
     * @return Значення N-го числа Фібоначчі.
     */
    private long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0, b = 1, c;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    /**
     * Повертає індекс числа Фібоначчі.
     *
     * @return Індекс числа Фібоначчі.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Повертає значення числа Фібоначчі, що відповідає індексу.
     *
     * @return Значення числа Фібоначчі.
     */
    public long getValue() {
        return value;
    }
}
