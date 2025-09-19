package structural.decorator;

public class CheeseDecorator extends BurgerDecorator {

    public CheeseDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        return decoratedBurger.cost() + 1.5; // Cost of cheese topping
    }
}