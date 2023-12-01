package exept;

public class ht1ex {
}

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        // Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
        int[] arr = new int[10];
        int err = arr[10];
    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 3;
        int b = 0;
        a = a / b;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int a;
        String b = "12K";
        a = Integer.parseInt(b);
    }

    static class Answer1 {
        public int[] subArrays(int[] a, int[] b) {

            //Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
            // и возвращающий новый массив c, каждый элемент которого равен разности элементов двух входящих
            // массивов в той же ячейке.
            //Если длины массивов не равны - верните нулевой массив длины 1.
            //Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
            //
            //int[] a - первый массив
            //int[] b - второй массив
            int[] c = {0};
            if (a.length != b.length) return c;
            c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
    }

    public static int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        //Реализуйте метод divArrays, принимающий в качестве аргументов два
        // целочисленных массива a и b, и возвращающий новый массив с,
        // каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        //Если длины массивов не равны - верните нулевой массив длины 1.
        //Важно: При выполнении метода единственное исключение,
        // которое пользователь может увидеть - RuntimeException, т.е. ваше.
        //Напишите свой код в методе divArrays класса Answer.
        // Метод divArrays принимает на вход два параметра:
        //int[] a - первый массив
        //int[] b - второй массив
        int[] c = {0};
        if (a.length != b.length) {
            return c;
        }
        c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] != 0)
                c[i] = a[i] / b[i];
            else throw new RuntimeException("На ноль делить нельзя");
        }
        return c;

    }
}

