import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      String one = sc.nextLine().replaceAll(" ", "").trim();
      String two = sc.nextLine().replaceAll(" ", "").trim();

      boolean output;
        if (one.equals(two)){
            output = true;
        }
        else output = false;

        System.out.println(output);
    }
}