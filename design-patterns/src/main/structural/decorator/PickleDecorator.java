package structural.decorator;

public class PickleDecorator extends BurgerDecorator {

    public PickleDecorator(Burger decoratedBurger) {

        super(decoratedBurger);
    }

    @Override
    public String getDescription() {

        return decoratedBurger.getDescription() + ", pickle";
    }

    @Override
    public double cost() {

        return decoratedBurger.cost() + 2.0; // Cost of cheese topping
    }
}