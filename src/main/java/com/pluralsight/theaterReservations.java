package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
public class theaterReservations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("What date wil you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine().trim();

        System.out.print("How many tickets would you like? ");
        int tickets = Integer.parseInt(scanner.nextLine().trim());

        String[] nameParts =name.split(" ");

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        String[] dateParts = date.split("/");

        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];

        System.out.println(tickets + " tickets reserved for " + year + "-" + month + "-" + day + " under " + lastName + ", " + firstName);







    }
}
