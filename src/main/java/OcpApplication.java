import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class OcpApplication {

    public static void main(String[] args) {

        OcpApplication ocpApplication = new OcpApplication();
        ocpApplication.process();

    }

    private boolean isNullOrEmpty(String input) {
        return !Optional.ofNullable(input).filter(s -> s.length() > 0).isPresent();
    }

    private static Function<String, Boolean> isNullOrEmpty2() {
        return s1 -> !Optional.ofNullable(s1).filter(s2 -> s2.length() > 0).isPresent();
    }

    private boolean isAnyNullOrEmpty(String... inputs) {
        return Arrays.stream(inputs)
            .anyMatch(s -> s == null || s.length() == 0);
    }


    private void process() {

        String s1 = "1";
        String s2 = "1";
        String s3 = "1";

        System.out.println(!isAnyNullOrEmpty(s1, s2, s3));

    }

    private boolean greaterThanFour(String letter) {
        if (letter.length() > 4) {
            return true;
        } else {
            return false;
        }
    }


}
