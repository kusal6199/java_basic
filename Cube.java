import java.util.*;
public class Cube {
    Scanner sc = new Scanner(System.in);
    double length;
    // double cost;

    void setLength(double length){
        this.length=length;
    }
    double getLength(){
        return this.length;
    }
    double calcullate_volume(){
        return Math.pow(this.length, 3);
    }
    double cost(double rate){
        return (6*this.length*this.length*rate);

    }
}
