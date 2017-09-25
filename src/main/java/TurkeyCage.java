public class TurkeyCage implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close gate");
    }
    public static void main(String... args) throws Exception {
        try (TurkeyCage tc = new TurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}

