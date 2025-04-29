public class ProvaStringhe {
    public static void main(String[] args) {
        String txt = "Lorem ipsum dolor sit amet";

        System.out.println("The length is: " + txt.length()); // lunghezza dei caratteri
        System.out.println("The length is: " + txt.toLowerCase()); // tutto minuscolo
        System.out.println("The length is: " + txt.toUpperCase()); // tutto maiuscolo
        System.out.println(txt.indexOf("dolor")); // Zero index


        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat(lastName.concat(firstName.concat(lastName))));
    

        String lorem = "Ipsum";
        String paragone = "Ipsum";

        System.out.println(lorem.equals(paragone));
        System.out.println(lorem.isEmpty());


        String frase = "ciao come stai?";

        System.out.println(frase.contains("cosa"));
    }
}