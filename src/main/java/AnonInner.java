public class AnonInner {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
    interface SaleTomorrowOnly {
        int dollarsOff();
    }
    public int admission(int basePrice) {
//        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
//            @Override
//            int dollarsOff() {
//                return 3;
//            }
//        };
        SaleTomorrowOnly saleTomorrowOnly = new SaleTomorrowOnly() {
            @Override
            public int dollarsOff() {
                return 4;
            }
        };
//        return basePrice - saleTodayOnly.dollarsOff();
        return basePrice - saleTomorrowOnly.dollarsOff();
    }

    public int pay(int basePrice) {
        return admission2(basePrice, new SaleTomorrowOnly() {
           public int dollarsOff() { return 5; }
        });
    }

    public int admission2(int basePrice,
                          SaleTomorrowOnly saleTomorrowOnly) {
        return basePrice - saleTomorrowOnly.dollarsOff();
    }

}
