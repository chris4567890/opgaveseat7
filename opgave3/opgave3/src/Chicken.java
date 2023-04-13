public class Chicken extends Animal implements Edible{

    public Chicken(){

    }

    @Override
    public String sound() {
        return "chirp chirp";
    }

    @Override
    public String howToEat() {
        return "Don't eat it raw.";
    }
}
