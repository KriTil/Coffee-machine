import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long factorial = 1;
        int n = 1;

        while (factorial <= m) {
            n++;
            factorial *= n;
        }

        System.out.println(n);
    }

}