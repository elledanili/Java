package lesson1_hello_world;

public class HW3 {

    public static void main(String[] args) {
        // 1. Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        //a == b - если переменные равны
        //a < b - если переменная a меньше b
        //a > b - если переменная b меньше a

       int A = 85;
       int B = 8;

        if (A==B) {
        System.out.println("A равно B");
        }
        if (A < B) {
            System.out.println("A меньше B");
        }
        if (A > B) {
            System.out.println("A больше B");


            // 2.Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
            //maybe a and b are even - если сумма переменных четная
            //some variable is odd - если сумма переменных нечетная
        }
        if ((A + B) % 2 == 0 ) {
            System.out.println("maybe a and b are even");
        }
        if ((A + B) % 2 != 0 ) {
            System.out.println("some variable is odd");
        }

        // 3. Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        //больше 10 - если переменная больше 10
        //меньше 100 - если переменная меньше 100
        //результат деления на 2 больше 20 - если это соответствует истине
        //значение переменной между 5 и 40 включительно - если это правда
        //значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        if ( A > 10) {
            System.out.println("A - больше 10");
        }
        if ( A < 100 ) {
            System.out.println("A - меньше 100");
        }
        if ( A / 2 > 20) {
            System.out.println("результат деления на 2 больше 20  " + ( A / 2 > 20));
        }
        if ( A >= 5 && A <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно  " + (A >= 5 && A <= 40));
        }
        else if ( A >= 5 && A <= 40 !=true ) {
            System.out.println("значение переменной меньше 5 или больше 40  ");
        }
    }
}
