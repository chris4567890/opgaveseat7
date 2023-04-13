public class Apple extends Fruit{
    public Apple(double weight, String taste, int cost) {
        super(weight, taste, cost);
    }

    @Override
    public String howToEat() {
        return "This is a multi billion dollar company that keeps an eye on this very code. Founded by Bill Gates not a fruit.";
    }
}
