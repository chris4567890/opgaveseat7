public class Orange extends Fruit{
    public Orange(double weight, String taste, int cost) {
        super(weight, taste, cost);
    }

    @Override
    public String howToEat() {
        return "peel of skin, then eat.";
    }
}
