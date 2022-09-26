public class App {
    public static float doubleNumber(double number) {

        return (float) number * 2;

    }
    public static void main(String[] args) throws Exception {
        double num = 123312.11;
        System.out.println(doubleNumber(num));
    }
}
