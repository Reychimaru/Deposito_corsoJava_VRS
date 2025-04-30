// Type Casting o Conversione dei tipi di dati 

public class EsTypeCasting {
    public static void main(String[] args) {
        int numA = 10;
        double decimalNum = (double) numA;
        System.out.println(decimalNum);

        double numB = 10.575;
        int integerNum = (int) numB;
        System.out.println(integerNum);

        int numC = 120;
        String numToString = String.valueOf(numC);
        System.out.println(numToString);

        String stringA = "250";
        int stringToNum = Integer.parseInt(stringA);
        System.out.println(stringToNum);

        float numD = 10.5f;
        double floatToDouble = (double) numD;
        System.out.println(floatToDouble);

        String stringB = "10.5";
        double stringToDouble = Double.parseDouble(stringB);
        System.out.println(stringToDouble);
    }
}
