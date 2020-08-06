import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;
        do {
            input = scanner.nextInt();
            if(sum >= 1000) {
                continue;
            } else {
            sum = sum + input;
            }
        } while (input != 0);
        if(sum >= 1000) {
            sum = sum - 1000;
        }
        System.out.println(sum);
    }
}
// Condition 1 - If the sum is greater than 1000, then print the difference between the amount and 1000
//Condition 2 - If were 0 , then print the sum