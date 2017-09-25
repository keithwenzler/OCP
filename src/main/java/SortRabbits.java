import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
    static class Rabbit {
        int id;
        String name;
        Rabbit(int id,
               String name){
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }
    public static void main(String... args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3, "hoppy"));
        rabbits.add(new Rabbit(1, "floppy"));
        rabbits.add(new Rabbit(2, "sleepy"));
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        System.out.println(rabbits);
        Collections.sort(rabbits, c);
        System.out.println(rabbits);
    }
}
