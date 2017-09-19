import org.apache.commons.lang3.builder.EqualsBuilder;

public class Lion extends Animal {

    String name;
    private int idNumber;
    private int age;

    public Lion(int idNumber,
                int age,
                String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Lion)) {
            return false;
        }
        Lion Lion = (Lion)object;
        return new EqualsBuilder()
                .appendSuper(super.equals(object))
                .append(idNumber, Lion.idNumber)
                .append(name, Lion.name)
                .isEquals();
    }

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat() {
        System.out.println("added meat");
    }

    public void play() {
        System.out.println("toss in meat");
    }

}
