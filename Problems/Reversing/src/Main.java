import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 100;
        int b = n % 10;
        int c = (n - a * 100 - b) / 10;
        int reverse = b * 100 + c * 10 + a;
        System.out.println(reverse);
    }
}
