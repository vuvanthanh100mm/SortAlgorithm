package org.example;
import java.util.Arrays;
import java.util.Scanner;

class InsertionSort {
    private static Scanner sc;

    public static void main(String args[]) {
        sc = new Scanner(System.in);

        System.out.println("Enter no of terms");
        int n = sc.nextInt();

        System.out.println("Enter the terms");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]) {
        for (int i = 1, j; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && temp < arr[j - 1]; j--)
                arr[j] = arr[j - 1];
            arr[j] = temp;
        }
    }
}