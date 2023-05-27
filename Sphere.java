
import java.util.*;
public class Sphere {
    double radius;
    Scanner sc = new Scanner(System.in);

    void read_radius(){
        System.out.println("enter radius: ");
        radius=sc.nextDouble();
        if (radius<0) {
            System.out.println("radious cant be negative");
            System.exit(0);
        }
    }

    void view_radius(){
        System.out.println("the radious is : "+ radius);
    }
    
    double claculate_volume(){
        double volume = (4/3)*3.14f*Math.pow(this.radius,3);
        return volume;
    }
    
    double calculateTSA(){
        double TSA= 4*3.14*this.radius*this.radius;
        return TSA;
    }

}

