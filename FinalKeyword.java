import java.util.*;

public class FinalKeyword {
    double length;
    double breadth;
    double area;
    final static double rate=100;
    Scanner sc = new Scanner(System.in);

    void getinfo(){
        System.out.println("enter length");
        length=sc.nextDouble();
        System.out.println("enter breadth");
        breadth=sc.nextDouble();
    }
    double calculateArea(){
        area= length*breadth;
        
        return area;
    }
    double calculateCost(){
        return area*rate;
    }
    // void getRate(){
    //     System.out.println("enter the rate: ");
    //     rate= sc.nextDouble();
    // } 
    // we cannot use this method to get rate value becouse rate is already inatilized by fianl keyworddd

}
