public class Squirrel {
    private int weight;
    private String species;
    public Squirrel(String species,
                    int weight) {
        if (species == null || weight <= 0) {
            throw new IllegalArgumentException();
        }
        this.species = species;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

}
