import classes.Test;

import java.util.ArrayList;
import java.util.List;

public class OcpApplication {

    public static void main(String[] args) {

        List<Test> testList = new ArrayList<>();
        for (int i = 0; i < 1000 ; i++) {
            testList.add(new Test(i + 1));
        }

        long count = testList.stream()
                .filter(t -> t.getID() > 500)
                .count();

        System.out.println(count);

    }

}
