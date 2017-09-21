public class LlamaTrainer {
    public boolean feedLlamas(int numberOfllamas) {
        int amountNeeded = 5 * numberOfllamas;
        HayStorage hayStorage = HayStorage.getInstance();
        if (hayStorage.getQuantity() < amountNeeded) {
            hayStorage.addHay(amountNeeded + 10);
        }
        boolean fed = hayStorage.removeHay(amountNeeded);
        if (fed) {
            System.out.println("Llamas have been fed");
        }
        return fed;
    }
}
