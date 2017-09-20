public class CaseOfThePrivateInterface {
    private interface  Secret {
        public void shh();
    }
    class DontTell implements Secret {

        @Override
        public void shh() {

        }
    }
}
