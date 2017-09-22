import java.util.Arrays;

public class OcpApplication {

    public static void main(String[] args) {

        AnimalBuilder.Animal animal = new AnimalBuilder()
                .setSpecies("horse")
                .setAge(12)
                .setFavoriteFoods(Arrays.asList("hay", "apples", "sugar cubes"))
                .build();

    }

}
