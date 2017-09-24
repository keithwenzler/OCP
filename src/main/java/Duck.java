import java.util.*;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;
    public Duck(String name,
                int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String... args) {

        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.weight - o2.weight;
            }
        };
        Comparator<Duck> byWeight2 = (o1, o2) -> o1.getWeight() - o2.getWeight();
        Comparator<Duck> byWeight3 = Comparator.comparingInt(Duck::getWeight);

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        System.out.println(ducks);
        System.out.println(ducks.get(0).compareTo(ducks.get(1)));
        Collections.sort(ducks);
        System.out.println("sorted");
        System.out.println(ducks);
        System.out.println(ducks.get(0).compareTo(ducks.get(1)));
        System.out.println("sorted");
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);
        System.out.println("sorted");
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks);
        System.out.println("sorted");
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks);
    }

}
