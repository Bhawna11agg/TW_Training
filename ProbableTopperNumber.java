package com.tw.assignment1;

import java.util.Scanner;

public class ProbableTopperNumber {

    public static void main(String[] args){

        int num;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();

        int numCopy=num;
        int oddSum=0;
        int evenSum=0;

        //traversing from the end of number and if even then sum up in evenSum otherwise sum up in oddSum
        while (numCopy>0){
            int digit= numCopy%10;
            numCopy= numCopy/10;
            if(digit%2==0){
                evenSum+=digit;
            }
            else{
                oddSum+=digit;
            }
        }

        if(evenSum==oddSum){
            System.out.println(num+" is Probable Topper Number!");
        }
        else{
            System.out.println(num+" is not a Probable Topper Number!");
        }
    }
}
