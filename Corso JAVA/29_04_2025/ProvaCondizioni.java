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
    }
}
