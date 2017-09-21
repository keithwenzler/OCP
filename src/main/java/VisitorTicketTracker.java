//singleton - lazy instantiation
public class VisitorTicketTracker {
    private static volatile VisitorTicketTracker instance;
    private VisitorTicketTracker() {

    }
    public static synchronized VisitorTicketTracker getInstance() {
        if (instance == null) {
            synchronized (VisitorTicketTracker.class) {
                if (instance == null) {
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }
}
