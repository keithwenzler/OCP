import java.util.HashMap;
import java.util.Map;
//factory pattern
public class FoodFactory {

    private static final Map<String, Food> foodMap  = new HashMap<>();

    static {
        foodMap.put("zebra", new Hay(100));
        foodMap.put("rabbit", new Pellets(5));
        foodMap.put("goat", new Pellets(30));
        foodMap.put("polar bear", new Fish(10));
    }

    public FoodFactory() {
    }

    public static Food getFood(String animalName) {
        if (foodMap.containsKey(animalName)) {
            return foodMap.get(animalName);
        } else {
            throw new UnsupportedOperationException("Unsupported animal: " + animalName);
        }
    }
}
