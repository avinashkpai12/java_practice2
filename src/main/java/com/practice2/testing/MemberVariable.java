package com.practice2.testing;

import java.util.Scanner;


public class MemberVariable {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();
        member.setName(scanner.nextLine());
        member.setAge(scanner.nextInt());
        member.setSalary(scanner.nextDouble());
        MemberVariable memberVariable = new MemberVariable();

    }
    public String getName(Member member){
        return member.getName();
    }
    public int getAge(Member member){
        return member.getAge();
    }
    public double getSalary(Member member){
        return member.getSalary();
    }
}