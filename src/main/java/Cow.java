public class Cow extends Animal {
    @Override
    public void feed() {
        addHay();
    }
    private void addHay() {
        System.out.println("added hay");
    }
}
