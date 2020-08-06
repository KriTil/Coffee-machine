import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int number = sc.nextInt();
            if(number % 6 == 0){
                sum += number;
            }
        }
        System.out.println(sum);
    }
}