import java.util.*;
public class TestInheritance {

    public static void main(String[] args) {
        double length;
        double breadth;
        double height;
        Scanner sc = new Scanner(System.in);

        BoxWeight b =new BoxWeight(null);
        b.getLength();
        b.getBreadth();
        b.getHeight();

        System.out.println("enter length:");
        length=sc.nextDouble();
        System.out.println("enter breadth:");
        breadth=sc.nextDouble();
        System.out.println("enter height:");
        height=sc.nextDouble();

        b.setLength(length);
        b.setBreadth(breadth);
        b.setHeight(height);

      
       
       

        System.out.println("TSA = "+b.calculateTSA());
        System.out.println("Volume = "+  b.clalculateVolume());
        System.out.println("Weight = "+  b.claculateWeight());


       

    }
    
}