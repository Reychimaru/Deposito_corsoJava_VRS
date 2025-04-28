import java.util.Scanner; // importa la classe Scanner

/* class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Crea uno oggetto Scanner
        System.out.println("Enter username");

        String userName = myObj.nextLine(); // legge l'input dell'user
        System.out.println("Username is: " + userName);
    }
} */

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Crea uno oggetto Scanner
        System.out.println("Enter age");

        int userAge = myObj.nextInt(); // legge l'input dell'user
        System.out.println("Username is: " + userAge);
    }
}