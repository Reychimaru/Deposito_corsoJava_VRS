import java.util.Scanner;

public class Es_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minCredits = 0.50;
        double maxCredits = 10;
        double randomCredits = minCredits + (Math.random() * (maxCredits - minCredits));

        double credits = randomCredits;

        boolean isOpen = true;

        while (isOpen) {
            System.out.println("Select a drink, your credits: " + credits);
            System.out.println("[A] Coffee: 1.50$");
            System.out.println("[B] Cappuccino: 2.00$");
            System.out.println("[C] Thé: 1.00$");
            System.out.println("[D] Water: 0.50$");
            System.out.println("[E] Exit");

            String selectedDrink = scanner.nextLine();

            if (credits < 0.50) {
                isOpen = false;
                System.out.println("You have no credits.");

            } else {
                switch (selectedDrink) {
                    case "A":
                        if (credits < 1.50) {
                            System.out.println("Not enough credits");
                        } else {
                            credits = credits - 1.50;
                            System.out.println("Selected Coffee, your credits: " + credits);
                        }
                        break;
                    case "B":
                        if (credits < 2.00) {
                            System.out.println("Not enough credits");
                        } else {
                            credits = credits - 2.00;
                            System.out.println("Selected Cappuccino, your credits: " + credits);
                        }
                        break;
                    case "C":
                        if (credits < 1.00) {
                            System.out.println("Not enough credits.");
                        } else {
                            credits = credits - 1.00;
                            System.out.println("Selected Thé, your credits: " + credits);
                        }
                        break;
                    case "D":
                        if (credits < 0.50) {
                            System.out.println("Not enough credits.");
                        } else {
                            credits = credits - 0.50;
                            System.out.println("Selected Water, your credits: " + credits);
                        }
                        break;
                    case "E":
                        System.out.println("Dispenser closed, your credits: " + credits);
                        isOpen = false;
                        break;
                    default:
                        System.out.println("Invalid input.");
                        break;
                }
            }
        }

        scanner.close();
    }
}
