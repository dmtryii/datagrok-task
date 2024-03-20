package com.dmtryii;

/*
    What is the complexity of the following functions (assuming they are implemented efficiently):

    max(double[] values)
    sort(double[] values)
    avg(double[] values)
    median(double[] values)
    stdev(double[] values)
    uniqueValuesCount(byte[] values)
 */

public class Complexity {
    /*
        max(double[] values)
        O(n) - функція повинна пройти через усі елементи,
        щоб знайти максимальне значення.

        sort(double[] values)
        quicksort або mergesort
        O(n log n) - цим алгоритмам потрібно порівнювати
        та переставляти елементи, щоб сортувати їх.

        avg(double[] values)
        O(n) - функції необхідно повторити всі елементи,
        щоб обчислити суму значень, яка необхідна для обчислення середнього.

        median(double[] values)
        O(n log n) - спочатку відсортувати масив, що займає O(n log n),
        а потім знайти середній елемент, що займає O(1)

        stdev(double[] values)
        O(n) - функція передбачає обчислення середнього значення (O(n)),
        а потім повторне проходження масиву для обчислення квадратів різниць (O(n))

        uniqueValuesCount(byte[] values)
        O(n) - функції необхідно пройти через усі елементи,
        щоб підрахувати кількість унікальних значень.
     */
}
