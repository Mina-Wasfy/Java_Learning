package chapter2;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The season of the year:");
        String season = scanner.next();

        System.out.println("Enter the whole number");
        int number = scanner.nextInt();

        System.out.println("Enter an Adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day , "
                + "I drink a minimum of " + number + " " + "Cups of Cofee");
    }
}
