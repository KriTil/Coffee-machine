import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        boolean exit = false;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i;  j++) {
                System.out.print(i + " ");
                count++;
                if (count == number) {
                    exit = true;
                    break;
                }
            }
            if (exit) {
                break;
            }
        }
    }
}

// the outer "for" loop as the one that controls which number you are on.
// The inner "for" loop controls how many times the number is written.