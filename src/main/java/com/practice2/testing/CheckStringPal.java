package com.practice2.testing;

import java.util.Scanner;

public class CheckStringPal {

    public static String checkString(String s){
        char arr[] = s.toCharArray();
        char temp;

        String st = "";
        for(int i=0;i<s.length()/2;i++){
            temp = arr[i];
            arr[i] = arr[s.length()-i-1];
            arr[s.length()-i-1] = temp;
        }

        if(s == null){
            st = "Not a Valid String";
        }
        String str = new String(arr);
        if(str.equals(s)){
            str = "Palindrome";
        }
        else{
            str = "Not a Palindrome";
        }

        return st;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String s = scan.next();

        checkString(s);
    }
}
