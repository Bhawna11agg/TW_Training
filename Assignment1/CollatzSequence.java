package com.tw.assignment1;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int timeRuleApplied = 0;
        System.out.print(num + " ");
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (3 * num) + 1;
            }
            System.out.print(num + " ");
            timeRuleApplied++;
        }
        System.out.print(timeRuleApplied);
    }
}
