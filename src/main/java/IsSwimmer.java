public class IsSwimmer implements CheckTrait {
    @Override
    public boolean test(Animal2 animal) {
        return animal.isSwimmer();
    }
}
