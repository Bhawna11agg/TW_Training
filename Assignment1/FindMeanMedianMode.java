package com.tw.assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class FindMeanMedianMode {

    public static String findMean(int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        double mean= (double)sum/n;

        return String.format("%.2f",mean);
    }

    public static String findMedian(int[] arr,int n){
        Arrays.sort(arr);

        // check for even case
        if (n % 2 != 0)
            return String.format("%.2f",(double)arr[n / 2]);

        double median=(double)(arr[(n - 1) / 2] + arr[n / 2]) / 2;
        return String.format("%.2f",median);
    }

    public static String findMode(int[] arr,int n){
        Arrays.sort(arr);

        int maxCount = 1, mode = arr[0];
        int currCount = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                currCount++;
            else
            {
                if (currCount > maxCount)
                {
                    maxCount = currCount;
                    mode = arr[i - 1];
                }
                currCount = 1;
            }
        }

        if (currCount > maxCount)
            mode = arr[n - 1];

        return String.format("%.2f",(double)mode);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Mean of the given elements of array is "+findMean(arr,n));
        System.out.println("Median of the given elements of array is "+findMedian(arr,n));
        System.out.println("Mode of the given elements of array is "+findMode(arr,n));
    }
}
