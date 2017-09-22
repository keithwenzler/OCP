import java.util.Collections;
import java.util.List;

//builder pattern
public class AnimalBuilder {

    private String species;
    private int age;
    private List<String> favoriteFoods;

    public static class Animal {

        private String species;
        private int age;
        private List<String> favoriteFoods;

        private Animal(String species,
                       int age,
                       List<String> favoriteFoods) {
            this.species = species;
            this.age = age;
            this.favoriteFoods = favoriteFoods;
        };

        public String getSpecies() {
            return species;
        }

        public int getAge() {
            return age;
        }

        public List<String> getFavoriteFoods() {
            return Collections.unmodifiableList(favoriteFoods);
        }
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }
    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
        return this;
    }

    public Animal build() {
        return new Animal(species, age, favoriteFoods);
    }

}
