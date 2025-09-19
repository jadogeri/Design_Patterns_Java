package structural.decorator;

public class MayoDecorator extends BurgerDecorator {

    public MayoDecorator(Burger decoratedBurger) {

        super(decoratedBurger);
    }

    @Override
    public String getDescription() {

        return decoratedBurger.getDescription() + ", mayo";
    }

    @Override
    public double cost() {

        return decoratedBurger.cost() + 1.0; // Cost of cheese topping
    }
}