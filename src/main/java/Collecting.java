import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collecting {

    public static void main(String... args) {

        String[] myStringArray = {"lions", "tigers", "bears"};
        Stream<String> myStringStream;
        String myString;
        Double myDouble;
        Map<String, Integer> myStringIntegerMap;
        Map<Integer, String> myIntegerStringMap;
        Map<Integer, List<String>> myIntegerStringListMap;
        Map<Integer, Set<String>> myIntegerStringSetMap;
        Map<Boolean, List<String>> myBooleanStringListMap;
        Map<Integer, Long> myIntegerLongMap;

        myStringStream = Stream.of(myStringArray);
        myIntegerLongMap = myStringStream.collect(
                Collectors.groupingBy(String::length, Collectors.counting())
        );
        System.out.println(myIntegerLongMap);

        myStringStream = Stream.of(myStringArray);
        myBooleanStringListMap = myStringStream.collect(
          Collectors.partitioningBy(s -> s.length() > 5)
        );
        System.out.println(myBooleanStringListMap);

        myStringStream = Stream.of(myStringArray);
        myIntegerStringSetMap = myStringStream.collect(
                Collectors.groupingBy(String::length, Collectors.toSet())
        );
        System.out.println(myIntegerStringSetMap);

        myStringStream = Stream.of(myStringArray);
        myIntegerStringListMap = myStringStream.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(myIntegerStringListMap);

        myStringStream = Stream.of(myStringArray);
        myIntegerStringMap = myStringStream.collect(
                Collectors.toMap(s -> s.length(), k -> k,
                        (s1, s2) -> s1 + "," + s2)
        );
        System.out.println(myIntegerStringMap);

        myStringStream = Stream.of(myStringArray);
        myStringIntegerMap = myStringStream.collect(
                Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(myStringIntegerMap);

        myStringStream = Stream.of(myStringArray);
        myDouble = myStringStream.collect(Collectors.averagingDouble(String::length));
        System.out.println(myDouble);

        myStringStream = Stream.of(myStringArray);
        myString = myStringStream.collect(Collectors.joining(",", "Mr.", "Jr."));
        System.out.println(myString);

    }

}
