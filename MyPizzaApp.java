public class MyPizzaApp {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
            return;
        }
        String franchise = args[0];
        String pizzaKind = args[1];

        PizzaStore store = null;
        if (franchise.equalsIgnoreCase("NYPizzaStore")) {
            store = new NYPizzaStore();
        } else if (franchise.equalsIgnoreCase("ChicagoPizzaStore")) {
            store = new ChicagoPizzaStore();
        } else {
            System.out.println("Invalid franchise. Choose between NYPizzaStore and ChicagoPizzaStore.");
            return;
        }

        Pizza pizza = store.orderPizza(pizzaKind);

        if (pizza != null) {
            System.out.println("Ordered a " + pizza.getName() + "!\n");
            System.out.println(pizza);
        } else {
            System.out.println("Sorry, we dont have that pizza");
        }
    }
}
