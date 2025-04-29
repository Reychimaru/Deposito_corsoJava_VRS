import java.util.Scanner;

public class ProvaCicli {
    public static void main(String[] args) {

/*      int i = 1;

        while (i <= 5) {
            i++;
            System.out.println(i);
        }


        int k = 0;

        do {
            System.out.println(k);
            k++;
        } while (k < 5);



    boolean control = true;
    Scanner scanner = new Scanner(System.in);
    while (control) {
        System.out.println("Continue?");
        String x = scanner.nextLine();
    if (x.equals("no") || x.equals("stop")) {
        control = false;
            }
        }

    scanner.close(); */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci un numero: ");
    int num = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
    }

    scanner.close();

    }
}
