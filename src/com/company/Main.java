package com.company;

import java.util.*;
public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while(t > 0){
                int n = sc.nextInt();
                int[] array = new int[n];
                for (int i=0; i<n ; i++ ) {
                    array[i] = sc.nextInt();
                }
                Solution ob = new Solution();
                System.out.println(ob.RulingPair(array,n));
                t--;
            }
        }
    }

//User function Template for Java
    class Solution {
        static int RulingPair(int arr[], int n) {
            // code here
            int sum=0;
            int sum1 = 0;
            int [] arr1 = new int[n];
            int[] array1 = new int[n];
            for(int i = 0;i<n;i++){
                arr1[i] = arr[i];
            }
            for(int i = 0;i<n;i++){
                while(arr1[i]>0){
                    int a = arr1[i]%10;
                    sum = sum + a;
                    arr1[i] = arr1[i]/10;
                }
                array1[i] = sum;
                sum = 0;
            }
            int[] temp = new int[array1.length];
            for(int i = 0;i<array1.length;i++){
                for(int j=i+1;j<array1.length;j++){
                    if(array1[i]==array1[j]){
                        temp[i] = array1[i];
                    }
                }
            }
            Arrays.sort(temp);
            int last = temp.length - 1;
            for(int i = 0;i<n;i++){
                if(temp[last]==array1[i]){
                    sum1 = sum1 + arr[i];
                }
            }
            return sum1;
        }
}
