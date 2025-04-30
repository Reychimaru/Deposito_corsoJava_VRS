public class EsNumeri {
    public static void main(String[] args) {

        int numA = 7;
        int numB = 12;
        int somma = numA + numB;
        System.out.println(somma);

        double numC = 10.5;
        double numD = 5.2;
        double differenza = numC - numD;
        System.out.println(differenza);

        int numE = 10;
        int numF = 5;
        int numG = 7;
        int prodotto = numE * numF * numG;
        System.out.println(prodotto);

        double numH = 10.0;
        double numI = 2.5;
        double quoziente = numH / numI;
        System.out.println(quoziente);

        double numL = 13;
        double modulo = numL % 5;
        System.out.println(modulo);

        int base = 2;
        int esponente = 5;
        int potenza = (int) Math.pow(base, esponente);
        System.out.println(potenza);

        double numero = 25.0;
        double radiceQuadrata = Math.sqrt(numero);
        System.out.println(radiceQuadrata);

        int numero1 = 8;
        int numero2 = 12;
        int massimo = Math.max(numero1, numero2);
        System.out.println(massimo);

        double numeroA = 5.7;
        double numeroB = 3.2;
        double numeroC = 7.1;
        double minimo = Math.min(Math.min(numeroA, numeroB), numeroC);
        System.out.println(minimo);

        int numeroCasuale = (int) (Math.random() * 20) + 1;
        System.out.println(numeroCasuale);   
    }
}
