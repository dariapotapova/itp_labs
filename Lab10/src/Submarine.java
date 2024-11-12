public class Submarine implements Swimmable {
    @Override
    public void stopSwimming() {
        System.out.println("Stopped swimming");
    }
    @Override
    public void swim() {
        System.out.println("Started swimming");
    }
}