import java.util.Scanner;

public class ProvaCondizioni {
    public static void main(String[] args) {
        int x = 20;
        int y = 18;

        if (x > y) {
            System.out.println("x è maggiore di y");
        } 


        int time = 20;

        if (time < 18) {
            System.out.println("Good morning."); // se minore di 18
        } else {
            System.out.println("Good evening."); // se maggiore di 18
        }

        
        int speed = 120;

        if (speed > 150) {
            System.out.println("Multa da 1000 euro");
        } else if (speed > 100) {
            System.out.println("Multa da 500 euro");
        } else {
            System.out.println("Velocità consentita");
        };

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
    }
}
