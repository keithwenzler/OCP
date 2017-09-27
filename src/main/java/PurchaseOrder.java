import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PurchaseOrder {
    private int id;
    private List<String> items;
    public PurchaseOrder(int id) {
        this.id = id;
        items = new ArrayList<>();
    }
    public void addItem(int item) {
        items.add(id + "_" + item);
    }
    public List<String> getItems() {
        return Collections.unmodifiableList(items);
    }

    public static void main(String... args) {
        Stream<PurchaseOrder> purchaseOrders = Stream.of(
          createPurchaseOrder(1),
                createPurchaseOrder(2),
                createPurchaseOrder(3)
        );

        purchaseOrders
                .flatMap(po -> po.getItems().stream())
                .forEach(System.out::println);

    }

    private static PurchaseOrder createPurchaseOrder(int id) {
        PurchaseOrder purchaseOrder = new PurchaseOrder(id);
        for (int i = 0; i < 100; i++) {
            purchaseOrder.addItem(i);
        }
        return purchaseOrder;
    }

}
