public class Animal2 {
    private String species;
    private boolean hopper;
    private boolean swimmer;
    private int age;
    public Animal2(String species,
                   boolean hopper,
                   boolean swimmer) {
        this.species = species;
        this.hopper = hopper;
        this.swimmer = swimmer;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isHopper() {
        return hopper;
    }

    public boolean isSwimmer() {
        return swimmer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be a negative number");
        }
        this.age = age;
    }

    public void setSpecies(String species) {
        if (species == null ||
                species.trim().isEmpty()) {
            throw new IllegalArgumentException("Species is required");
        }
        this.species = species;
    }

}
