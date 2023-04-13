public abstract class Animal {
    private double weight;

    public double getWeight(){
        return weight;
    }

    public void setWeight(int num){
        this.weight = num;
    }

    public abstract String sound();

}
