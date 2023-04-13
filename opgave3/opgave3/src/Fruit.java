abstract class Fruit implements Edible {
    private double weight;
    private String taste;

    private int cost;

    public Fruit(double weight,String taste,int cost){
        this.weight = weight;
        this.taste  = taste;
        this.cost = cost;
    }

    public void setWeight(double num){
        this.weight = num;
    }
    public void setTaste(String word){
        this.taste = word;
    }

    public void setCost(int num){
        this.cost = num;
    }

    public double getWeight(){
        return weight;
    }

    public String getTaste(){
        return taste;
    }

    public int getCost(){
        return cost;
    }

}
