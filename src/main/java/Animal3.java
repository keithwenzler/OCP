import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//immutable
public final class Animal3 {

    private final List<String> favoriteFoods;

    public Animal3(List<String> favoriteFoods) {
        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() {
        return Collections.unmodifiableList(favoriteFoods);
    }

}
