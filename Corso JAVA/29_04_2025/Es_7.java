/* Andare a creare un sistema che ti permetta 
di registrarti e fare login su due cicli separati 
e che solo dopo il login ti permette di usare una 
calcolatrice a due fattori e un sistema 
di cambio dei dati. */

import java.util.Scanner;

public class Es_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "";
        String username = "";
        boolean isRegistered = false;
        boolean isLoggedIn = false;

        while (!isRegistered) {
            System.out.println("Please register your account.");
            System.out.println("Enter your username");
            String registerUsername = scanner.nextLine();
            username = registerUsername;
            System.out.println("Enter your password");
            String registerPassword = scanner.nextLine();
            password = registerPassword;
            System.out.println("You've been registered as " + username);
            isRegistered = true;
        }

        while (!isLoggedIn) {
            System.out.println("Please login.");
            System.out.println("Enter your username");
            String loginUsername = scanner.nextLine();
            System.out.println("Enter your password");
            String loginPassword = scanner.nextLine();

            if (loginPassword.equals(password) && loginUsername.equals(username)) {
                System.out.println("Access granted.");
                isLoggedIn = true;
            } else {
                System.out.println("Wrong username or password.");
            }
        }

        boolean exit = false;

        while (!exit) {
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Calculator selected.");
                    System.out.println("Enter the first number");
                    double num1 = scanner.nextDouble();
                    System.out.println("Enter the second number");
                    double num2 = scanner.nextDouble();

                    System.out.println("Select an operation:");
                    System.out.println("[+], [-], [*], [/]");
                    String operator = scanner.nextLine();

                    switch (operator) {
                        case "+":
                            System.out.println(num1 + num2);
                            break;
                        case "-":
                            System.out.println(num1 - num2);
                            break;
                        case "*":
                            System.out.println(num1 * num2);
                            break;
                        case "/":
                            if (num2 != 0) {
                                System.out.println("Risultato: " + (num1 / num2));
                            } else {
                                System.out.println("Errore: divisione per zero!");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("App closed.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
