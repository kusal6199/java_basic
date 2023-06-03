// import java.awt.Point;
import java.util.*;
public class Points {
    double x;
    double y;
    Scanner sc = new Scanner(System.in);

    void read_coordinate(){
        System.out.println("enter the x coordinate");
        x=sc.nextDouble();
        System.out.println("enter the y coordinate");
        y=sc.nextDouble();
    }
    void display_coordinate(){
        // Points p1;
        // Points p2;
        System.out.println("x co-ordinate: "+ x);
        System.out.println("y co-ordinate: "+ y);
    }

    double calculate_distance(Points p1, Points p2){
        double d= Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
       
        return d;
    }




}
