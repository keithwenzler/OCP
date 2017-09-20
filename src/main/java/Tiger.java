public class Tiger extends Animal implements Sprint {
    @Override
    public void sprint(Animal animal) {
        System.out.println("Animal is sprinting fast! " + animal.toString());
    }

    @Override
    public void feed() {
        System.out.println("Toss in meat");
    }
}
