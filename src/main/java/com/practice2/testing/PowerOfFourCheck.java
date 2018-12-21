package com.practice2.testing;

import java.util.Scanner;

public class PowerOfFourCheck {

    public static String checkIf(int n){
        String str = "";
        boolean flag = false;
        while(n%4==0){
            n = n/4;

            if(n==1){
                flag = true;
                break;
            }
        }

        if(n < 0){
            str = "Please enter a positive integer";
        }

        if(flag) {
            str = "Power of Four";
        }
        else{
            str = "Not a power of four";
        }

        return str;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scan.nextInt();
        String st = checkIf(num);

    }
}
