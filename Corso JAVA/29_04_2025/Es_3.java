import java.util.Scanner;

public class Es_3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Type a number from 1 to 7");
        int numInput = myObj.nextInt();

        switch (numInput) {
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
