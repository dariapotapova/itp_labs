public class Penguin implements Swimmable, Living {
    @Override
    public void swim() {
        System.out.println("Penguin started swimming");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Penguin stopped swimming");
    }
}
