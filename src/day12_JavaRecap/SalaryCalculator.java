package day12_JavaRecap;

import java.util.Scanner;

public class SalaryCalculator {
    /*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();//100000
        input.nextLine();
        System.out.println("Enter your full name: ");
        String fulName = input.nextLine();

        System.out.println("Enter Company Name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter Job Title: ");
        String jobTitle = input.nextLine();

        System.out.println(fulName+" your salary is $"+salary+" and You work at "+companyName+" as "+jobTitle);
    }
}
