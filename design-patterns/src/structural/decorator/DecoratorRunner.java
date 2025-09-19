package structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {

        Burger burger = new RegularBurger();
        System.out.println(burger.getDescription() + " $" + burger.cost());

        burger = new CheeseDecorator(burger);
        System.out.println(burger.getDescription() + " $" + burger.cost());

        burger = new OnionDecorator(burger);
        System.out.println(burger.getDescription() + " $" + burger.cost());

        burger = new PickleDecorator(burger);
        System.out.println(burger.getDescription() + " $" + burger.cost());

        burger = new MayoDecorator(burger);
        System.out.println(burger.getDescription() + " $" + burger.cost());

    }
}
