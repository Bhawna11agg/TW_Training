package com.tw.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class FindRangeOfElements {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Oops! Invalid Entry.");
        } else if (n == 0) {
            System.out.println("No Range exists!!");
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[n - 1] - arr[0]);
    }
}
