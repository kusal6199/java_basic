import java.util.Scanner;
public class Test_points {
    public static void main(_String[] args) {
        Points p1 =new Points();
        Points p2= new Points();

        System.out.println("enter coordinate for p1 points:");
        p1.read_coordinate();
        System.out.println("");
        System.out.println("enter coordinate for p2 points:");
        p2.read_coordinate();
        System.out.println("");
        System.out.println("the coordinate of point p1 are as:");
        p1.display_coordinate();
        System.out.println("");
        System.out.println("the coordinate of point p2 are as:");
        p2.display_coordinate();
        System.out.println("");
        System.out.println("the ditance berween two points is "+ p2.calculate_distance(p1, p2));
    }
}
