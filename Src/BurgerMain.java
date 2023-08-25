public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("Булочка звичайна", "М'ясо свиняче", "Сир", "Латук, томат, огірки", true);
        Burger dietBurger = new Burger("Булочка звичайна", "М'ясо свиняче", "Сир", "Латук, томат, огірки", false);
        Burger doubleMeatBurger = new Burger("Булочка звичайна", "Подвійне м'ясо", "Сир", "Латук, томат, огірки", true);

        System.out.println("Звичайний бургер:");
        System.out.println(regularBurger);
        System.out.println();

        System.out.println("Дієтичний бургер:");
        System.out.println(dietBurger);
        System.out.println();

        System.out.println("Бургер подвійне м'ясо:");
        System.out.println(doubleMeatBurger);
    }
}
