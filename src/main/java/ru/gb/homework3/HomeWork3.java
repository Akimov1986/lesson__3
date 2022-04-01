/**
 * Java 1. HomeWork 2
 *
 * @author Dmitriy
 * @version 31.03.2022
 */

package ru.gb.homework3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    static Random random = new Random();

    public static void main(String[] args) {
        numberSubstitution();
        myArrRandom();
        multiplicationByTwo();
        fillingArr();
        System.out.println(Arrays.toString(createArr(6, 3)));
        minMax();

    }

    static void numberSubstitution() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void myArrRandom() {

        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(myArr));
    }

    static void multiplicationByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillingArr() {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    static void minMax() {
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(myArr));
        int min = myArr[0];
        int max = myArr[0];
        for (int i = 0; i < myArr.length; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
            if (max < myArr[i]) {
                max = myArr[i];
            }
        }
        System.out.println(" Минимальное значение " + min + "\n Максимальное значение " + max);
    }
}
