import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int start = 0;
        int yep;
        int ans = 0;

        while (start < lenght) {
            yep = scanner.nextInt();
            start++;

            if (yep % 4 == 0 && yep > ans) {
                ans = yep;
            }
        }
        System.out.println(ans);
    }
}