//factory pattern
public class ZooKeeper {
    public static void main(String... args) {
        final Food food = FoodFactory.getFood("polar bear");
        System.out.println(food.getQuantity());
        food.consumed();
    }
}
