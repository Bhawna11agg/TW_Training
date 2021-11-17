package com.tw.assignment1;

import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args){
        int row,col;
        Scanner sc= new Scanner(System.in);
        row= sc.nextInt();
        col= sc.nextInt();

        int[][] matrix= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        int[] rowSum= new int[row];
        for(int i=0;i<row;i++){
            int currRowSum=0;
            for(int j=0;j<col;j++){
                currRowSum+=matrix[i][j];
            }
            rowSum[i]=currRowSum;
            if(i>0 && rowSum[i]!=rowSum[i-1]){
                System.out.println("No, it's not a magic square");
                return;
            }
        }

        int[] colSum= new int[col];
        for(int i=0;i<col;i++){
            int currColSum=0;
            for(int j=0;j<row;j++){
                currColSum+=matrix[i][j];
            }
            colSum[i]=currColSum;
            if((i>0 && colSum[i]!=colSum[i-1])|| (i==0 && colSum[i]!=rowSum[0])){
                System.out.println("No, it's not a magic square");
                return;
            }
        }

        int forwardDiagonalSum=0,backwardDiagonalSum=0;

        for(int i=0;i<row;i++){
            forwardDiagonalSum+=matrix[i][i];
        }

        for(int i=0;i<row;i++){
            backwardDiagonalSum+=matrix[row-1-i][i];
        }

        if(forwardDiagonalSum!=rowSum[0] || backwardDiagonalSum!=rowSum[0]){
            System.out.println("No, it's not a magic square");
        }
        else{
            System.out.println("Yes, it's a magic square");
        }

    }
}
