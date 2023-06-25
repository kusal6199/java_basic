import java.util.*;
public class Box {
    double length;
    double breadth;
    double height;
    Scanner sc= new Scanner(System.in);
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Scanner getSc() {
        return sc;
    }
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        

    }
    public double calculateTSA(){
        return 2*(length*breadth+breadth*height+length*height);
    }
    public double clalculateVolume(){
        return length*breadth*height;
    }
    
   
}
