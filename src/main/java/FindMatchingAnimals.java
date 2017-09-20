import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindMatchingAnimals {

    private static void print(Animal2 animal,
                              CheckTrait checkTrait) {
        if (checkTrait.test(animal)) {
            System.out.println(animal.getSpecies());
        }
    }

    private static void print2(Animal2 animal,
                               Predicate<Animal2> checkTrait) {
        if (checkTrait.test(animal)) {
            System.out.println(animal.getSpecies());
        }
    }

    private static void print3(String a,
                               String b,
                               BiPredicate<String, String> biPredicate) {
        if (biPredicate.test(a, b)) {
            System.out.println("true");
        }
    }

    private static void print4(int count, Function<Integer, Integer> function) {
        System.out.println(function.apply(count));
    }

    public static void main(String[] args) {

        print4(4, c -> 10);
        print3("keith", "wenzler", (a, b) -> a.equals("keith") && b.equals("wenzler"));
        Animal2 catfish = new Animal2("fish", false, true);
        IsSwimmer isSwimmer = new IsSwimmer();
        if (isSwimmer.test(catfish)) {
            System.out.println(catfish.getSpecies());
        }
        print2(catfish, Animal2::isSwimmer);
    }

}
