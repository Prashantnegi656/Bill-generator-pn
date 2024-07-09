public class PizzaBillGenerator {
    public static void main(String[] args) {
        Pizza pizza = Menu.selectPizza();
        int i = 1;
        Menu.addTakeAway(pizza);
        System.out.println("\n--- Your Bill ---");
        System.out.println(pizza);
    }
}