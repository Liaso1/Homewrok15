public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Regular Bun", "Beef Patty", "Cheddar Cheese", "Lettuce, Tomato, Onion");
        Burger dietBurger = new Burger("Whole Wheat Bun", "Chicken Patty", "Swiss Cheese", "Lettuce, Tomato, Onion", false);
        Burger doubleMeatBurger = new Burger("Sesame Bun", "Beef Patty", "American Cheese", "Lettuce, Pickle", true, true);

        System.out.println("Regular Burger:");
        System.out.println(regularBurger);
        System.out.println();

        System.out.println("Diet Burger:");
        System.out.println(dietBurger);
        System.out.println();

        System.out.println("Double Meat Burger:");
        System.out.println(doubleMeatBurger);
    }
}
