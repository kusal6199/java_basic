import java.util.*;
public class Line_rect{
    double x;
    double y;
    Scanner sc = new Scanner(System.in);

    void read_line(){
        System.out.println("enter x coordinate ");
        x= sc.nextDouble();
        System.out.println("enter y coordinate ");
        y= sc.nextDouble();
    }


    double calculate_first_distance(Line_rect p1, Line_rect p2){
        double d1= Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
        return d1;
    }
    // double calculate_second_distance(Line_rect p3, Line_rect p4){
    //     double d2= Math.sqrt((p4.x-p3.x)*(p4.x-p3.x)+(p4.y-p3.y)*(p4.y-p3.y));
    //     return d2;
    // }


}


