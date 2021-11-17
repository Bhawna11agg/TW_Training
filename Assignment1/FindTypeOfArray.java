package com.tw.assignment1;

import java.util.Scanner;

public class FindTypeOfArray {

    public static int findType(int[] arr, int n) {
        int oddElements = 0, evenElements = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenElements++;
            } else {
                oddElements++;
            }
        }

        if (oddElements == 0) {
            return 1;
        } else if (evenElements == 0) {
            return 2;
        }
        return 3;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Oops! Invalid Entry.");
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int arrayType = findType(arr, n);

        if (arrayType == 1) {
            System.out.println("Even");
        } else if (arrayType == 2) {
            System.out.println("Odd");
        } else {
            System.out.println("Mixed");
        }
    }
}
