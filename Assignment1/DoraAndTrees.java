package com.tw.assignment1;

import java.util.Scanner;

public class DoraAndTrees {

    public static void main(String[] args){
        int row,col,treeNo;
        Scanner sc= new Scanner(System.in);
        row= sc.nextInt();
        col= sc.nextInt();
        treeNo= sc.nextInt();

        //check validity of tree number, number of rows, number of columns
        if(treeNo<=0 || row<=0 || col<=0){
            System.out.println("Oops! There is some wrong entry");
            return;
        }

        //check whether tree number is present in garden or not
        if(treeNo> (row*col)){
            System.out.println("Oops! Tree Number not present in Dora's garden");
            return;
        }

        //check if treeNo is present in first row
        if(treeNo<= col){
            System.out.println("yes");
            return;
        }

        //calculate column number of given tree number
        int treeNoCol= treeNo % row;

        if(treeNoCol==1 || treeNoCol==col){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
