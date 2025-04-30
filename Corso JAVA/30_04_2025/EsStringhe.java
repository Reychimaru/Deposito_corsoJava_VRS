public class EsStringhe {
    public static void main(String[] args) {

        String username = "Reychimaru";
        System.out.println(username.length());

        System.out.println(username.toUpperCase());
        System.out.println(username.toLowerCase());

        String phrase = "Lorem ipsum dolor sit amet";
        String word = "Lorem";
        boolean checkA = phrase.startsWith(word);
        boolean checkB = phrase.endsWith(word);
        System.out.println(checkA);
        System.out.println(checkB);

        int numero = 42;
        String stringa = String.valueOf(numero);
        System.out.println(stringa);

        String firstname = "Mario";
        String lastname = "Rossi";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        String frase = "Buongiorno a tutti!";
        String sottostringa = frase.substring(11, 18);
        System.out.println(sottostringa);

        String frase2 = "Ciao, come va?";
        String sequenza = "come";
        boolean contieneSequenza = frase2.contains(sequenza);
        System.out.println(contieneSequenza);

        String nome = "Alice";
        int eta = 25;
        String messaggio = String.format("Ciao, mi chiamo %s e ho %d anni.", nome, eta);
        System.out.println(messaggio);

        String frase3 = "   Ciao, come stai?   ";
        String stringaSenzaSpazi = frase3.trim();
        System.out.println("La stringa senza spazi è: " + stringaSenzaSpazi);
    }
}
