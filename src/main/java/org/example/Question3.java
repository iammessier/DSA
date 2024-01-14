package org.example;
import java.util.Scanner;


public class Question3 {
    public static void intersection(int[] arr1, int[] arr2){
        boolean forNoInter = false;
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    forNoInter = true;
                }
            }
        }
        if(forNoInter == false){
            System.out.println("No intersection");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        for(int i = 0; i<length; i++){

            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i<length; i++){

            arr2[i] = sc.nextInt();
        }
        intersection(arr1, arr2);
    }
}