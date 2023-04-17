package controlStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        System.out.println(" WelCome to my program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz Enetr the year:");
        int year = scanner.nextInt();
        if((year%4==0) && (year%100!=0) ||(year%400==0))
        {
            System.out.println("this is leapyear");
        }
        else
        {
            System.out.println("this is not leapyear");
        }
    }
}
