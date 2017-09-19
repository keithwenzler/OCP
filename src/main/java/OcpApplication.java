import java.util.function.Predicate;

public class OcpApplication {

    public static void main(String[] args) {

        OcpApplication ocpApplication = new OcpApplication();
        ocpApplication.test(6, i -> i > 5);

    }

    private void test(int count, Predicate<Integer> integerPredicate)  {

        if (integerPredicate.test(count)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

}
