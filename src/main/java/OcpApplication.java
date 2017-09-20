public class OcpApplication {

    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        test(tiger, a -> a.careFor());

    }

    private static void test (Animal animal, Sprint sprint) {
        sprint.sprint(animal);
    }

}
