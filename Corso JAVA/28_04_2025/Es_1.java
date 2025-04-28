import java.util.Scanner;

public class Es_1 {
    public static void main(String[] args) {
        Scanner scanUser = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String userFullname = scanUser.nextLine(); // legge il nome completo

        System.out.println("Enter your age:");
        int userAge = scanUser.nextInt(); // legge l'età

        System.out.println("Are you male? (true/false)");
        boolean isMale = scanUser.nextBoolean(); // legge il sesso (se è male o no)

        System.out.println("Your temperature in Fahrenheit?");
        float userTemp = scanUser.nextFloat(); // legge la temperatura

        System.out.println("Ciao " + userFullname + ", sei un uomo?" + isMale + " di età " + userAge + ", la tua temperatura è: " + userTemp);
    }
}
