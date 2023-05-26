import java.util.*;
public class Test_employee {
    public static void main(String[] args) {
        Employe rajesh = new Employe();
        // rajesh view_data();
        rajesh.read_data();
        
        System.out.println();

        rajesh.view_data();
        System.out.println("the tax amount is : "+ rajesh.calculateTax(0.3));
    }
}
