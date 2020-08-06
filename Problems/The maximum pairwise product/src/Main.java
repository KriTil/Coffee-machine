import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int product = numbers[n - 1] * numbers[n - 2];
        System.out.println(product);
    }
}
//A simple solution to this is to fill the array with the given numbers, sort the array, 
//and get the last two numbers of the array. There you can multiple those and print that.
