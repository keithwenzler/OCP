public class Assertions {
    public static void main(String... args) {
        int numGuests = -5;
        assert numGuests > 0: "invalid number of guests";
        System.out.println(numGuests);
    }
}
