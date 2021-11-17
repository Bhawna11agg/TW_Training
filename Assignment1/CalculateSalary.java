package com.tw.assignment1;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] workHours = new int[7];

        for (int i = 0; i < 7; i++) {
            workHours[i] = scan.nextInt();
        }

        int salary = 0, weeklyWorkHours = 0;

        for (int i = 0; i < 7; i++) {
            salary += workHours[i] * 100;
            if (i == 0)
                salary += (workHours[i] * 100) / 2;
            else if (i == 6)
                salary += (workHours[i] * 100) / 4;
            else {
                if (workHours[i] > 8) {
                    salary += (workHours[i] - 8) * 15;
                }
                weeklyWorkHours += workHours[i];
            }
        }

        if(weeklyWorkHours > 40){
            salary+=(weeklyWorkHours-40)*25;
        }

        System.out.println(salary);
    }
}
