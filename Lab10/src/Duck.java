public class Duck implements Swimmable, Flyable, Living {
    @Override
    public void stopSwimming() {
        System.out.println("Duck stopped swimming");
    }

    @Override
    public void swim() {
        System.out.println("Duck started swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck started flying");
    }

    @Override
    public void stopFlying() {
        System.out.println("Duck stopped flying");
    }
}
