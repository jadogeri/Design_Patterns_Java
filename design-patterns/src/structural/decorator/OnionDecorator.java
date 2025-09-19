package structural.decorator;

public class OnionDecorator extends BurgerDecorator {

    public OnionDecorator(Burger decoratedBurger) {

        super(decoratedBurger);
    }

    @Override
    public String getDescription() {

        return decoratedBurger.getDescription() + ", onion";
    }

    @Override
    public double cost() {

        return decoratedBurger.cost() + 2.5; // Cost of cheese topping
    }
}