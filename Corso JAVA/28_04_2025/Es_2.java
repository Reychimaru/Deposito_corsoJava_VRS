public class Es_2 {
    public static void main(String[] args) {
        int numA = 7;
        int numB = 10;
        int numC = 33;
        int numD = 105;

        boolean myNumAB = numA >= 10 && numB >= 10;
        System.out.println("sono entrambi i dati " + numA + " e " + numB + " maggiore o uguale a 10? " + myNumAB);

        boolean myNumCD = numC > 100 || numD > 100;
        System.out.println("è uno dei due dati " + numC + " e " + numD + ", maggiore di 100? " + myNumCD);
    
        boolean isTen = !(numA > 10);
        System.out.println("Il numero " + numA + " non è maggiore di 10? " + isTen);
    }
}
