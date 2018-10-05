package com.company;
import java.util.Scanner;
// to get the imput from user
public class Main {

    public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
    //to initiate user's input
        String ans = " ";
do {
    System.out.println("enter you number");
    int num = src.nextInt();
    //asking and storing user's number in num variable.

    do {

        if (num % 5 == 0 || num % 7 == 0) {
            System.out.println(num);
          }

        num = num - 1;
    } while (num >= 1);
    System.out.println("enter another number? (y/n)");
    ans =  src.next();
}while( ans .equals("y"));
        if (ans .equals("n")) {
            System.out.print( "Thank you for playing" );
        }}

}
