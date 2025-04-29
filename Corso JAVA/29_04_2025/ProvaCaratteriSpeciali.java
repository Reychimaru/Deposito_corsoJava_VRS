import java.util.Arrays;

public class ProvaCaratteriSpeciali {
    public static void main(String[] args) {

        /* String txtA = "Lorem ipsum \"dolor\" sit amet";
        String txtB = "Lorem ipsum \'dolor\' sit amet";
        String txtC = "Lorem ipsum\\amet";

        String txtD = "Lorem ipsum dolor.\nsit amet";
        String txtE = "Lorem ipsum dolor.\ssit amet";
        String txtF = "Lorem ipsum\tamet";

        System.out.println(txtA);
        System.out.println(txtB);
        System.out.println(txtC);
        System.out.println(txtD);
        System.out.println(txtE);
        System.out.println(txtF); */

        String str = "Hello World";
        String[] words = str.split("\\s"); 
        // divide ogni parola tramite gli spazi vuoti e li inserisce in un array chiamato words.
        System.out.println(Arrays.toString(words)); 
        // stampa l'array di parole singole.

        String description = "Article about strings...";
        int length = description.length();
        System.out.println(length);
    }
}
