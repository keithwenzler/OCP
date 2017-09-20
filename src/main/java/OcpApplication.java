import java.util.stream.Stream;

public class OcpApplication {

    public static void main(String[] args) {

        boolean b1 = false;
        boolean b2 = false;

//        Stream<Boolean> results = Stream.of(b1, b2);

        boolean results = Stream.of(b1, b2).anyMatch(b -> b.equals(true));

        System.out.println(results);


    }


}
