import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int squaredNum = 0;
        int baseNum = 1;

        while (true) {
            squaredNum = baseNum * baseNum;
            if (squaredNum > n) {
                break;
            }
            System.out.println(squaredNum);
            baseNum++;
        }
    }
}

