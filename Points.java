// import java.awt.Point;
import java.util.*;
public class Points {
    double x;
    double y;
    Scanner sc = new Scanner(System.in);

    void read_coordinate(){
        System.out.println("enter the x coordinatr");
        x=sc.nextDouble();
        System.out.println("enter the y coordinatr");
        y=sc.nextDouble();
    }

    double calculate_distance(Points p1, Points p2){
        double d= Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
        return d;
    }




}
