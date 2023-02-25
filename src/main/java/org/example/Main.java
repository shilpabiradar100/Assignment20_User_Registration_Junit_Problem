package org.example;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        UserValidator validator = new UserValidator();
        System.out.println(validator.validateFirstName(firstName));

        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println(validator.validateLastName(lastName));

        System.out.println("Enter your email address: ");
        String email = scanner.next();
        System.out.println(validator.validateEmail(email));

        System.out.println("Enter your password: ");
        String password = scanner.next();
        System.out.println(validator.validatePassword(password));
        scanner.close();
    }


}