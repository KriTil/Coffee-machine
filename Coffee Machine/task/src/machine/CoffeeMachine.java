package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int cups = 9;
        int exit = 0;

        while (exit == 0) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.next();
            System.out.println("");
            switch (input) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, " +
                            "3 - cappuccino, back - to main menu:");
                    String drink = scanner.next();

                    switch (drink) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (beans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println();
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 250;
                                beans -= 16;
                                cups--;
                                money += 4;
                            }

                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println();
                            } else if (beans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println();
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups--;
                                money += 7;
                            }

                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                System.out.println();
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                System.out.println();
                            } else if (beans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                System.out.println();
                            } else if (cups == 0) {
                                System.out.println("Sorry, not enough cups!");
                                System.out.println();
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups--;
                                money += 6;
                            }
                            break;
                        case "back":

                    }

                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int w = scanner.nextInt();
                    water += w;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int m = scanner.nextInt();
                    milk += m;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int b = scanner.nextInt();
                    beans += b;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int c = scanner.nextInt();
                    cups += c;
                    System.out.println();
                    break;

                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    System.out.println();
                    break;

                case "remaining":
                    info(water, milk, beans, cups, money);
                    System.out.println();
                    break;

                case "exit":
                    exit = 1;
                    break;
            }
        }
    }

    public static void info(int water, int milk, int beans, int cups, int money) {
        if (money == 0) {
            System.out.println("The coffee machine has:\n" +
                    water + " of water\n" +
                    milk + " of milk\n" +
                    beans + " of coffee beans\n" +
                    cups + " of disposable cups\n" +
                    money + " of money");
        } else {
            System.out.println("The coffee machine has:\n" +
                    water + " of water\n" +
                    milk + " of milk\n" +
                    beans + " of coffee beans\n" +
                    cups + " of disposable cups\n" +
                    "$" + money + " of money");
        }
    }
}
