public class Eagle implements Fly {
    @Override
    public int getWingSpan() throws Exception {
        return 15;
    }

//    @Override
//    public void land() {
//        System.out.println("Eagle is diving fast");
//    }
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.land();
        System.out.println(Eagle.MAX_SPEED);
        System.out.println(Fly.calculateSpeed(100, 50));

    }
}
