package Session_06.java;

public class RoundoffErroreSample {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 0.9;
        System.out.println(a - b);

        for (float f = 5; f != 0.0; f -= 0.1) {
            System.out.println(f);

        }
    }
}
