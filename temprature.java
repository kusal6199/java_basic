import java.util.Scanner;
public class temprature {
    public static void main(_String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the temprature at ferrnheit");
        double fern = sc.nextDouble();
        double cel =(100*(fern-32))/180;
        System.out.println(fern+"ferneight is equal to "+cel+" celcious");
        sc.close();
    }
    
}
