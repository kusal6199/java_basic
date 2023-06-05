import java.util.*;

public class Cartesian {
  private double x1;
  private double y1;
  double distance;
  double theta;

    Scanner sc = new Scanner (System.in);
   

    public void getCoordinate(){
        System.out.println("enter x coordiante: ");
        x1 = sc.nextDouble();
        System.out.println("enter y coordiante: ");
        y1 = sc.nextDouble();
    }

    public double calculate_distance() {
       distance = Math.sqrt(x1*x1+y1*y1);
       return distance;
    }

    public double calculate_angle(){
        theta = Math.atan(y1/x1)*(180 / Math.PI);
        return theta;

    }

    void convert_to_polar(){
        System.out.print("Polar coordinate is:  (" + distance+ ","+ theta +")" );
    }
}
