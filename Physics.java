import java.util.Scanner;

public class Physics {
    public static void main(String[] args) {
        final double g = 9.8;
        double u, m, h;
        System.out.println("Enter mass and height:");
        Scanner in = new Scanner(System.in);
        m = in.nextDouble();
        h = in.nextDouble();
        u = m * g * h;
        System.out.println("Result = " + u);
    }
}
