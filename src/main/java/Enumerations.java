public class Enumerations {

    public enum Season {

        WINTER("Low") {
            @Override
            public void printHours() {
                System.out.println("9-3");
            }
        },
        SPRING("Medium") {
            @Override
            public void printHours() {
                System.out.println("9-5");
            }
        },
        SUMMER("High") {
            @Override
            public void printHours() {
                System.out.println("9-7");
            }
        },
        FALL("Medium") {
            @Override
            public void printHours() {
                System.out.println("9-5");
            }
        };

        public abstract void printHours();

        private String expectedVisitors;

        Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }

    }

    public enum OnlyOne {

        ONCE(true);

        OnlyOne(boolean b) {
            System.out.println("constructing");
        }

    }

}
