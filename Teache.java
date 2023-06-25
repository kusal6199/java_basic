import java. util.*;
public class Teache {

    int id;
    _String full_name;
    double slary;
    // double rate;
    Scanner sc =new Scanner(System.in);

    void read_info(){
        System.out.println("enter id: ");
        id= sc.nextInt();
        System.out.println("enter full name: ");
        full_name= sc.nextLine();
        full_name= sc.nextLine();
        System.out.println("enter slary: ");
        slary= sc.nextDouble();
    }
    void view_teacher(){
        System.out.println("Name: "+ full_name);
        System.out.println("ID: "+ id);
        System.out.println("Salary: "+ slary);

    }
    double increa_salary(double rate){
        // System.out.println("enter rate of salary increase: ");
        // rate= sc.nextDouble();
        double final_slary=slary+(rate/100*slary);
        return final_slary;
    }
}
