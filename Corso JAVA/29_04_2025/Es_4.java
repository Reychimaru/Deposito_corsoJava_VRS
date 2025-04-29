/* Scrivi un programma Java che calcoli il preventivo per 
un'assicurazione auto in base ai seguenti criteri:

Età del conducente:
    • Meno di 18 anni → "Non sei idoneo per l'assicurazione"
    • 18 - 25 anni → Applica una maggiorazione del 20% sul prezzo base
    • 26 - 50 anni → Nessuna maggiorazione
    • Più di 50 anni → Sconto del 10%
Anni di esperienza alla guida:
    • Meno di 2 anni → Applica una maggiorazione del 30% sul prezzo base
    • 2 o più anni → Nessuna maggiorazione
Numero di incidenti negli ultimi 5 anni:
    • 0 incidenti → Nessun aumento
    • 1 incidente → Aumento del 15%
    • 2 o più incidenti → Aumento del 30%
    • Più di 4 incidenti → "Non sei idoneo per l'assicurazione"
Scelta del pacchetto assicurativo:
    • Base: Prezzo standard
    • Intermedio: +20%
    • Premium: +50%
Prezzo base dell'assicurazione: 500€ */

import java.util.Scanner;

public class Es_4 {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
        Scanner myString = new Scanner(System.in);

        System.out.println("Enter your age:");
        int clientAge = myInt.nextInt();

        int baseCost = 500;
        int insuranceCost = 0;

        if (clientAge < 18) {
            System.out.println("Not allowed for the insurance.");
        } else if (clientAge <= 25) {
            System.out.println("+20% additional costs applied.");
            insuranceCost = insuranceCost + (baseCost * 20 / 100);
        } else if (clientAge <= 50) {
            System.out.println("No age bonuses or costs applied.");
        } else {
            System.out.println("-10% bonus applied.");
            insuranceCost = insuranceCost - (baseCost * 10 / 100);
        };

        System.out.println("Enter your years of driving experience:");
        int drivingExp = myInt.nextInt();

        if (drivingExp < 2) {
            System.out.println("+30% additional costs applied.");
            insuranceCost = insuranceCost + (baseCost * 30 / 100);
        } else {
            System.out.println("No additionals costs applied.");
        };

        System.out.println("Enter the numer of car accidents occured in the last 5 years:");
        int carAccidents = myInt.nextInt();

        switch (carAccidents) {
            case 0:
                System.out.println("No additionals costs applied.");
                break;
            case 1:
                System.out.println("15% additional costs applied.");
                insuranceCost = insuranceCost + (baseCost * 15 / 100);
                break;
            case 2:
                System.out.println("30% additional costs applied.");
                insuranceCost = insuranceCost + (baseCost * 30 / 100);
                break;
            case 3:
                System.out.println("30% additional costs applied.");
                insuranceCost = insuranceCost + (baseCost * 30 / 100);
                break;
            default:
                System.out.println("Not allowed for the insurance.");
                break;
        }

        System.out.println("Chose a plan: Basic, Intermediate, Premium.");
        String choosenPlan = myString.nextLine();

        switch (choosenPlan) {
            case "Basic":
                System.out.println("Basic plan");
                System.out.println("Total cost for your insurance: " + (insuranceCost + baseCost));
                break;
            case "Intermediate":
                insuranceCost = insuranceCost + (baseCost * 20 / 100);
                System.out.println("Intermediate plan: +20% additional costs.");
                System.out.println("Total cost for your insurance: " + (insuranceCost + baseCost));
                break;
            case "Premium":
                insuranceCost = insuranceCost + (baseCost * 50 / 100);
                System.out.println("Premium plan: +20% additional costs.");
                System.out.println("Total cost for your insurance: " + (insuranceCost + baseCost));
                break;
            default:
                System.out.println("Invalid plan.");
                break;
        }
    }
}
