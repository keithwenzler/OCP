import java.util.Comparator;

public class ChainingComparator implements Comparator<Squirrel> {
    @Override
    public int compare(Squirrel o1, Squirrel o2) {
        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies);
        c = c.thenComparing(Squirrel::getWeight);
        return c.compare(o1, o2);
    }

    public static void main(String... args) {
        Squirrel s1 = new Squirrel("northern", 1);
        Squirrel s2 = new Squirrel("southern", 2);
        Squirrel s3 = new Squirrel("northern", 3);
        Squirrel s4 = new Squirrel("southern", 2);
        ChainingComparator cc = new ChainingComparator();
        System.out.println(cc.compare(s1, s2));
        System.out.println(cc.compare(s2, s3));
        System.out.println(cc.compare(s1, s3));
        System.out.println(cc.compare(s2, s4));
    }
}
