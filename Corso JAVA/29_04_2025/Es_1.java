import java.util.Scanner;

public class Es_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("Enter username"); // chiede l'username
        String usernameInput = myObj.nextLine();

        System.out.println("Enter password"); // chiede la password
        String passwordInput = myObj.nextLine();

        // controlla se username e password inseriti sono corretti
        if (username.equals(usernameInput) && password.equals(passwordInput)) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Wrong username or password.");
        }
    }
}