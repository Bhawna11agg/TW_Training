package com.tw.assignment1;

import java.util.Scanner;

public class StudentsAndLab {

    public static void main(String[] args) {
        // write your code here
        int x,y,z,n;
        Scanner sc= new Scanner(System.in);
        x=  sc.nextInt();
        y=  sc.nextInt();
        z=  sc.nextInt();
        n=  sc.nextInt();

        //check validity of students and seats
        if(x<0 || y<0 || z<0 || n<0){
            System.out.println("Oops!! There is some wrong entries.");
            return;
        }

        //check if we are able to assign seats or not
        int maxSeat= Math.max(x,Math.max(y,z));
        if(maxSeat<n){
            System.out.println("Oops!! Not able to assign any lab to this class.");
            return;
        }
        //maxSeat=3;

        int labSeats =Integer.MAX_VALUE;
        int lab=1;

        if(labSeats>x && x>=n){
            labSeats=x;
        }

        if(labSeats>y && y>=n){
            labSeats=y;
            lab=2;
        }

        if(labSeats>z && z>=n){
            labSeats=z;
            lab=3;
        }

        System.out.println("We can assign Lab" + lab + " to this class!!");
    }
}
