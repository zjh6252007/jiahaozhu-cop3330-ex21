/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */

import java.util.Scanner;

public class numToNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the month:");
        int month = scan.nextInt();
        String months = "";
        switch(month){
            case 1:months = "january";
            break;
            case 2:months = "February";
            break;
            case 3:months = "March";
            break;
            case 4:months = "April";
            break;
            case 5:months = "May";
            break;
            case 6:months = "June";
            break;
            case 7:months = "July";
            break;
            case 8:months = "August";
            break;
            case 9:months = "September";
            break;
            case 10:months = "October";
            break;
            case 11:months = "November";
            break;
            case 12:months = "December";
            break;
            default:
                break;
        }
        System.out.println("The name of the month is " + months);
    }
}
