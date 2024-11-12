public enum Drinks {
    COLA(90, "Coke-Cola"),
    SPRITE(70, "Sprite"),
    FANTA(80, "Fanta");
    private final int price;
    private final String name;
    Drinks(int price, String name){
        this.price = price;
        this.name = name;
    }
    String output() {
        return this.name + " " + this.price + "руб.";
    }
}
