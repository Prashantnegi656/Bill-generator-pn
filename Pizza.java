public class Pizza {
    private String type;
    private int basePrice;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public void addTakeAway() {
        this.takeAway = true;
    }

    public int calculateTotal() {
        int total = basePrice;
        if (extraCheese) total += 100;
        if (extraToppings) total += 150;
        if (takeAway) total += 20;
        return total;
    }

    @Override
    public String toString() {
        return "Pizza type: " + type + "\n" +
                "Base price: " + basePrice + "\n" +
                "Extra cheese: " + (extraCheese ? "Yes" : "No") + "\n" +
                "Extra toppings: " + (extraToppings ? "Yes" : "No") + "\n" +
                "Take away: " + (takeAway ? "Yes" : "No") + "\n" +
               "Total price: " + calculateTotal();
    }
}