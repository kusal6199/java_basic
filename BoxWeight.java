import java.util.Scanner;

public class BoxWeight extends Box {
    public double weight;
    public BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height);
        this.weight=weight;
        //TODO Auto-generated constructor stub
    }


    

  




    








    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public double claculateWeight(){
        double weight = 45;
        return weight;

    }
    
}
