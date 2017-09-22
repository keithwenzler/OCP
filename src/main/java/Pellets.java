//factory pattern
class Pellets extends Food {
    Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Pellets eaten: " + getQuantity());
    }
}
