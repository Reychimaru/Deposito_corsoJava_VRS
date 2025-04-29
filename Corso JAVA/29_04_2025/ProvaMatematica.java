public class ProvaMatematica {
    public static void main(String[] args) {
       int x = Math.max(5, 10);
       int y = Math.min(5, 10);
       int z = 12;

       System.out.println(x);
       System.out.println(y);
       System.out.println(Math.sqrt(z));


       System.out.println(Math.abs(-5.2));
       System.out.println(Math.random());

       int randomNum = (int)(Math.random() * 101);
       System.out.println(randomNum);
    }
}
