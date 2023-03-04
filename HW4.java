package lesson1_hello_world;

public class HW4 {

    public static void main(String[] args) {

        //1 . вывести числа от 0 до 15

        for (int i = -1; i < 15; i = i + 1) {
            System.out.println(i + 1);
        }

        // 2 . вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.

        for (int i = 5; i * 5 < 10000; i = i * 5) {
            System.out.println("Result is " + i * 5);
        }

        // 3 . вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).

        for (int i = 40; i <= 60; i = i + 1) {
            if (i % 4 == 0)
                System.out.println(i);
        }

        for (int i = 40; i <= 60 && i % 4 == 0; i = i + 4) {
            System.out.println("i = " + i);
        }
    }
}
