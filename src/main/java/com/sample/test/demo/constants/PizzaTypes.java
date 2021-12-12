package com.sample.test.demo.constants;


public enum PizzaTypes {
    SMALL_NO_TOPPINGS("Small 6 Slices - no toppings", 6.75),
    SMALL_ONE_TOPPINGS("Small 6 Slices - 1 topping", 7.50),
    MEDIUM_TWO_TOPPINGS("Medium 8 Slices - 2 toppings", 9.75),
    LARE_NO_TOPPINGS("Large 10 Slices - no toppings", 11.75),
    LARGE_THREE_TOPPINGS("Large 10 Slices - 2 toppings", 13.50);

    private String displayName;
    private double cost;

    private PizzaTypes(String displayName, double cost) {
        this.displayName = displayName;
        this.cost = cost;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getCost() {
        return cost;
    }

}
