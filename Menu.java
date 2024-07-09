import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static Pizza selectPizza() {
        System.out.println("Select Pizza Type:");
        System.out.println("1. Veg Pizza (300)");
        System.out.println("2. Non-Veg Pizza (400)");
        System.out.println("3. Deluxe Veg Pizza (550)");
        System.out.println("4. Deluxe Non-Veg Pizza (650)");

        int choice = scanner.nextInt();
        Pizza pizza = null;

        switch (choice) {
            case 1:
                pizza = new Pizza("Veg Pizza", 300);
                break;
            case 2:
                pizza = new Pizza("Non-Veg Pizza", 400);
                break;
            case 3:
                pizza = new Pizza("Deluxe Veg Pizza", 550);
                break;
            case 4:
                pizza = new Pizza("Deluxe Non-Veg Pizza", 650);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
                return selectPizza();
        }

        if (choice == 1 || choice == 2) {
            addExtras(pizza);
        }

        return pizza;
    }

    private static void addExtras(Pizza pizza) {
        System.out.println("Add extra cheese? (100) (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            pizza.addExtraCheese();
        }

        System.out.println("Add extra toppings? (150) (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            pizza.addExtraToppings();
        }
    }

    public static void addTakeAway(Pizza pizza) {
        System.out.println("Opt for take away? (20) (y/n)");
        if (scanner.next().equalsIgnoreCase("y")) {
            pizza.addTakeAway();
        }
    }
}