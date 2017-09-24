public class Animal4 implements Comparable<Animal4> {
    private int id;
    public Animal4(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Animal4 o) {
        return id - o.id;
    }

    public static void main(String... args) {
        Animal4 a1 = new Animal4(3);
        Animal4 a2 = new Animal4(12);
        Animal4 a3 = new Animal4(22);
        System.out.println(a1.compareTo(a2));
        System.out.println(a2.compareTo(a1));
        System.out.println(a3.compareTo(a1));
    }

}
