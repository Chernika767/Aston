import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        printThreeWords();// Вывести три слова на отдельной строке
        checkSumSign(); // Вывести сумму "Положительная" или "Отрицательная"
        printColor();  // Вывести цвет числа
        compareNumbers(); // Больше ли а b ?
        System.out.println(five()); // Вернуть сумму больше 10 и меньше 20 вкл
        six(100); //Положительное или отрицательное число
        System.out.println(seven(50)); // Вернуть true or false
        eight("Привет, мир!", 5); // Напечать строку данное количество раз
        System.out.println(nine(2000)); // Вернуть високосный год или нет
        ten(); // Замена 0 на 1, 1 на 0 в массиве
        eleven(); // Заполнить массив от 1 до 100
        twelve(); // Увеличить число в 2 раза, если она меньше 6
        thirteenth(); // Создать матрицу с диагоналями со значением 1
        fourteen(15, 9);// Запомлнить массив заданной длинной и значением
    }

    static void printThreeWords() {
        // Вывести три слова на отдельной строке
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        // Вывести сумму "Положительная" или "Отрицательная"
        int a = 5;
        int b = 7;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        // Вывести цвет числа
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0) {
            if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    static void compareNumbers() {
        // Больше ли а b ?
        int a = 99;
        int b = 98;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean five() {
        // Сумма больше 10 и меньше 20 вкл
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        int y;
        y = scan.nextInt();
        int result = x + y;
        return result > 10 & result <= 20;

    }

    static void six(int y) {
        //Положительное или отрицательное число
        if (y >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }

    static boolean seven(int x) {
        // Вернуть true or false
        return x >= 0;
    }

    static void eight(String string, int digit) {
        //Напечать строку данное количество раз
        int count = 0;
        while (count < digit) {
            System.out.println(string);
            count++;
        }

    }

    static boolean nine(int year) {
        // Вернуть високосный год или нет
        return year % 100 != 0 & year % 4 == 0 & year % 400 == 0;

    }

    static void ten() {
        //Замена 0 на 1, 1 на 0 в массиве
        int[] number = {1, 0, 1, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < 10; i++) {
            if (number[i] == 0) {
                number[i] = 1;
            } else {
                number[i] = 0;
            }
        }
        System.out.println(Arrays.toString(number));
    }

    static void eleven() {
        int[] massive = new int[100];
        for (int i = 0; i < 100; i++) {
            massive[i] = i + 1;
        }
        System.out.println(Arrays.toString(massive));
    }

    static void twelve() {
        int[] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (num[i] < 6) {
                num[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(num));
    }

    static void thirteenth() {
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j | i + j == 4) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }


    }

    static void fourteen(int len, int initialValue) {
        int[] n = new int[len];
        for (int i = 0; i < len; i++) {
            n[i] = initialValue;
        }
        System.out.println(Arrays.toString(n));
    }
}
