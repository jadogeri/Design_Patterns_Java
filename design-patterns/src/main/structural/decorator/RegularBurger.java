package structural.decorator;

public class RegularBurger implements Burger {
    @Override
    public String getDescription() {
        return "Regular Burger";
    }

    @Override
    public double cost() {
        return 4.25; // Base price of the Burger
    }
}
