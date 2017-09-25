import java.util.Arrays;

public class JammedTurkeyCage implements AutoCloseable {
    private int id;
    JammedTurkeyCage(int id) {
        this.id = id;
    }
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door " + id + " does not close");
    }
    public static void main(String... args) {
        try (JammedTurkeyCage jtc1 = new JammedTurkeyCage(1);
            JammedTurkeyCage jtc2 = new JammedTurkeyCage(2)) {
            throw new IllegalStateException("turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            Arrays.stream(e.getSuppressed())
                    .forEach(t -> System.out.println(t.getMessage()));
        }
    }
}
