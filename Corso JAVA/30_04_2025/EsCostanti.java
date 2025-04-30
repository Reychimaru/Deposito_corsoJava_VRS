public class EsCostanti {

    public static final int number = 7;
    public static final String name = "Rey";
    public static final double height = 1.75;

    public static final double PI = 3.141592653589793;
    public static final double raggio = 5.0;

    public static double calcolaArea(double raggio) {
        return PI * raggio * raggio;
    }

    public static void main(String[] args) {

        System.out.println(number);
        System.out.println(name);
        System.out.println(height);

        System.out.println("Area del cerchio: " + calcolaArea(raggio));

    }
}
