import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double p = sc.nextDouble();
        double k = sc.nextDouble();

        int years = 0;
        while (k > m) {
            m = m + m * (p / 100);
            years ++;
        }
        System.out.println (years);

    }
}