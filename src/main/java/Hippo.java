import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hippo extends HeavyAnimal {

    private String name;
    private double weight;

    public Hippo(String name,
                 double weight) {
        this.name = name;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
