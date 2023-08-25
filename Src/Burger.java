public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String salad;
    public boolean mayonnaise;

    public Burger(String bun, String meat, String cheese, String salad, boolean mayonnaise){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
    }
    @Override
    public String toString() {
        String mayonnaiseStatus = mayonnaise ? "Yes" : "No";
        return "Інгрідієнти:\n" +
                "Булочка: " + bun + "\n" +
                "М'ясо: " + meat + "\n" +
                "Сир: " + cheese + "\n" +
                "Салат: " + salad + "\n" +
                "Майонез: " + mayonnaiseStatus;
    }
}

