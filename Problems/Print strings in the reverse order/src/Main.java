import java.util.Scanner;//put imports you need here

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String one = scanner.next();
        String line = scanner.nextLine();
        String two = scanner.next();
        String line1 = scanner.nextLine();
        String three = scanner.next();

        System.out.println(three + "\n" + two + "\n" + one);
    }
}