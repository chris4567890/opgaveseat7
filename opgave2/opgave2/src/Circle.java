public class Circle {
    private int radius;
    public Circle(int radius){

        this.radius = radius;
        if(radius <0){
            try {
                throw new Exception("only positive nr.s allowed you shall not pass");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setRadius(int num){
        this.radius = num;
    }

    public double getArea(){
        double pi = 3.14;
        double area = pi*radius*radius;
        return area;
    }

}
