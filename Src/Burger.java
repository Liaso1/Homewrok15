class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String veggies;
    private boolean mayo;

    public Burger(String bun, String meat, String cheese, String veggies, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
    }

    public Burger(String bun, String meat, String cheese, String veggies) {
        this(bun, meat, cheese, veggies, true);
    }

    public Burger(String bun, String meat, String cheese, String veggies, boolean mayo, boolean doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat ? "Double " + meat : meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
    }

    @Override
    public String toString() {
        String mayoStatus = mayo ? "Yes" : "No";
        return "Burger Ingredients:\n" +
                "Bun: " + bun + "\n" +
                "Meat: " + meat + "\n" +
                "Cheese: " + cheese + "\n" +
                "Veggies: " + veggies + "\n" +
                "Mayo: " + mayoStatus;
    }
}

