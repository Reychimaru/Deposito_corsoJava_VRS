import java.util.Scanner;

public class Es_2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int luckyNum = 7;

        System.out.println("Guess the lucky number:");
        int numInput = myObj.nextInt();

        if (numInput < luckyNum) {
            System.out.println(numInput + " is smaller than the lucky number.");
        } else if (numInput > luckyNum) {
            System.out.println(numInput + " is greater than the lucky number.");
        } else {
            System.out.println("Congratulations! " + numInput + " is the lucky number!");
        }
    }
}
