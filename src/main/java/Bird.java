public class Bird extends Animal {
    @Override
    public void feed() {
        addSeed();
    }
    private void addSeed() {
        System.out.println("added seed");
    }
}
