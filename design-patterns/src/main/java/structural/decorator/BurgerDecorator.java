package structural.decorator;

public abstract class BurgerDecorator implements Burger {
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription();
    }

    @Override
    public double cost() {
        return decoratedBurger.cost();
    }
}