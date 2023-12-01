package exept;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Размер текущего файла: " + getFileSize(
                new File("/Users/rakhmanov/Desktop/Geek Brains/Java/J" +
                        "/ErrAndExeption/src/main/java/exept/Main.java")));

        System.out.println("====================================");
        int[] arrD1 = {1, 2, 3};
        int[] arrD2 = {1, 2, 3, -1};
        System.out.println(Arrays.toString(Answer.divArrays(arrD1, arrD2)));

        System.out.println("====================================");
        System.out.println(divide(1, 1));
        a();
        int[][] arr2 = {{2, 3, 5, 5, 6}, {5, 3, 5, 6, 7}, {5, 3, 5, 6, 7}, {5, 3, 5, 6, 7}};
        int[] arr = new int[10];
        System.out.println("searchErr: " + searchError(arr));
        System.out.println("searchNum: " + searchNumbers(arr, 3));
        client();

        task4(arr2);
    }


    public static int searchError(int[] arr) {
        if (arr == null || arr.length < 8)
            return -1;

        return arr.length;
    }

    public static int searchNumbers(int[] arr, int number) {
        if (arr == null) return -3;
        if (arr.length < 8) return -1;
        if (arr.length > 99) return -4;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == number) return i;

        return -2;

    }

    public static void client() {
        int[] arr = {1, 2, 4, 394};
        Scanner iscanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int nums = iscanner.nextInt();

        switch (searchNumbers(arr, nums)) {
            case -1:
                System.out.println("Длинна массива меньше некоторого заданного минимума");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Вместо массива пришел null");
                break;
            case -4:
                System.out.println("Длинна массива меньше некоторого заданного минимума");
                break;

            default:
                System.out.println("Элемент найден");
        }
    }

    public static int task4(int[][] arr) {
        int count = 0;
        for (int[] i : arr) {
            if (i == null) throw new RuntimeException("Есть пустые строки");
        }
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Работать только с квадратными массивами");
        }
        for (int[] i : arr) {

            for (int j : i) {
                if (j > 1) {
                    throw new RuntimeException("Может лежать только значение 0 или 1");
                }
                count += j;
            }
        }

        return 0;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на ноль нельзя");
        }

        return a / b;

    }

    public static long getFileSize(File file) {
        if (!file.exists())
            return -1L;
        return file.length();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[9]);
    }


    public static int checkArray(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                System.out.println(i + "Пустая ячейка");
        }


        return 0;
    }
}