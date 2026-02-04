/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.enchanced_switches;

/**
 *
 * @author Nullroot 13
 */
import java.util.Scanner;

public class Enchanced_switches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enchance Switch = A replacement to many else if statements (Java14 feature)
/*
        String day = "Sunday";

        if (day.equals("Monday")) {
            System.out.println("it is weekday");

        } else if (day.equals("tuesday")) {
            System.out.println("it is week day ");

        } else if (day.equals("wensday")) {
            System.out.println("it is week day");

        } else if (day.equals("Thursday")) {
            System.out.println("it is week day ");

        } else if (day.equals("Friday")) {
            System.out.println("it is week day ");

        } else if (day.equals("Saturday")) {
            System.out.println("it is weekend");
        } else if (day.equals("Sunday")) {
            System.out.println("it is weekend");





         */
        System.out.println("Enter the day of the week");
        String day = scanner.nextLine();

        switch (day) {

            case "Monday", "Tuesday", "Wensday", "Thursday", "Friday" ->
                System.out.println("it is weekday");

            case "saturday", "sunday" ->
                System.out.println("it is weekend");

            default ->
                System.out.println(day + "is not a day");

        }
        scanner.close(); 
    }

}
