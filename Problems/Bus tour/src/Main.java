import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        int willCrash = 0;
        int count = 0;
        for (int i = 0; i < bridges; i++) {
            int bridgesHeights = scanner.nextInt();
            count++;
            if (bridgesHeights <= height) {
                willCrash = 1;
                System.out.println("Will crash on bridge " + count);
                break;
            }
        }
        if (willCrash == 0) {
            System.out.println("Will not crash");
        }
    }
}