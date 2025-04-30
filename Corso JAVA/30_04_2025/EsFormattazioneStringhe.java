public class EsFormattazioneStringhe {
    public static void main(String[] args) {
        int eta = 25;
        String nome = "Alice";
        String messaggio = String.format("Nome: %s, Età: %d", nome, eta);
        System.out.println(messaggio);
    }
}
