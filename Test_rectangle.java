
import java.util.*;
public class Test_rectangle {
    public static void main(String[] args) {
        Line_rect p1 = new Line_rect();
        Line_rect p2 = new Line_rect();
        Line_rect p3 = new Line_rect();
        Line_rect p4 = new Line_rect();
        
        p1.read_line();
        p2.read_line();
        p3.read_line();
        p4.read_line();

        p1.calculate_first_distance(p1, p2);
        p3.calculate_second_distance(p3, p4);

       System.out.println("the area is "+ p1.calculate_first_distance(p1,p2)*p2.calculate_second_distance(p3,p4));
    } 
}
