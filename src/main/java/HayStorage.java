//singleton
public class HayStorage {

    private int quantity = 0;

    private HayStorage() {

    }

    private static final HayStorage instance = new HayStorage();

    public static HayStorage getInstance() {
        return instance;
    }

    public synchronized void addHay(int amount) {
        quantity =+ amount;
    }

    public synchronized boolean removeHay(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }

    public synchronized int getQuantity() {
        return quantity;
    }

    public static void main(String... args) {
        HayStorage hayStorage = HayStorage.getInstance();
        hayStorage.addHay(5);
        hayStorage.removeHay(3);
        hayStorage.removeHay(3);
    }

}
