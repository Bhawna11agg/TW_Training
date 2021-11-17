package com.tw.assignment1;

import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {

        int row, col;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                if (matrix[i][j] == 0) {
                    System.out.println("no");
                    return;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("no");
                    return;
                }
            }
        }

        System.out.println("yes");
    }
}
