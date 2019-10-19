package com.company;

import java.util.*;
public class Main{
    static Scanner sc=new Scanner(System.in);
    static Random rm=new Random();
    static int count=0, right=0, wrong=0;
    public static void main(String[] args) {
        System.out.println("Difficulty level 1 - 4");
        System.out.println("Enter Level number ");
        int lb=sc.nextInt();
        switch(lb){
            case 1:while(count< 10){
                count++;
                int n1=rm.nextInt(10);
                int n2=rm.nextInt(10);
                Random rnum = new Random();
                mult(n1, n2);
            }
                percen();
                break;
            case 2:while(count< 10){
                count++;
                int n1=rm.nextInt(100);
                int n2=rm.nextInt(100);
                Random rnum = new Random();
                mult(n1, n2);
            }
                percen();
                break;
            case 3:while(count< 10){
                count++;
                int n1=rm.nextInt(1000);
                int n2=rm.nextInt(1000);
                Random rnum = new Random();
                mult(n1, n2);
            }
                percen();
                break;
            case 4:while(count< 10){
                count++;
                int n1=rm.nextInt(10000);
                int n2=rm.nextInt(10000);
                Random rnum = new Random();
                mult(n1, n2);
            }
                percen();
                break;
        }
    }
    static void mult(int n1, int n2){
        System.out.println("Answer the following");
        int multi=n1*n2;
        while(true){
            System.out.println("What is "+n1+" times "+n2+"?");
            int n3=sc.nextInt();
            if(n3==multi){
                right++;
                rightanswer();
                break;
            }
            else{
                wrong++;
                wronganswer();
                break;
            }
        }
    }
    static void rightanswer(){
        int c1=rm.nextInt(4);
        switch(c1){
            case 0: System.out.println("Nice job!");
                break;
            case 1: System.out.println("Keep up the great work!");
                break;
            case 2: System.out.println("Very nice!");
                break;
            case 3: System.out.println("Fantastic!");
                break;
        }
    }
    static void wronganswer(){
        int c2=rm.nextInt(4);
        switch(c2){
            case 0: System.out.println("No, keep trying!");
                break;
            case 1: System.out.println("Wrong, try it once more!");
                break;
            case 2: System.out.println("Don't give up!");
                break;
            case 3: System.out.println("Please try again!");
                break;
        }

    }
    static void percen(){
        if(right>= 7.5){
            System.out.println("Congratulation you did it!");
        }
        else {
            System.out.println("Please ask your teacher for more practice");
        }
    }

}