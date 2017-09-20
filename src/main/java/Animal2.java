public class Animal2 {
    private String species;
    private boolean hopper;
    private boolean swimmer;
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
}
