public class JavaBean {

    private int age;
    private boolean oldEnoughToDrive;
    private String name;

    public JavaBean(int age,
                    String name) {
        this.age = age;
        this.name = name;
        if (age >= 16) {
            oldEnoughToDrive = true;
        } else {
            oldEnoughToDrive = false;
        }

    }

    public int getAge() {
        return age;
    }

    public boolean isOldEnoughToDrive() {
        return oldEnoughToDrive;
    }

    public String getName() {
        return name;
    }
}
