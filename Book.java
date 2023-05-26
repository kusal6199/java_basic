import java.util.*;
public class Book {
    int book_id;
    String title;
    double price;
    Scanner sc =new Scanner(System.in);

    void read_book_details(){
        // Scanner sc =new Scanner(System.in);
        System.out.println("enter Id:");
        book_id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter title:");
        title=sc.nextLine();
        System.out.println("enter price:");
        price=sc.nextDouble();
       
    }

    void view_details(){
        System.out.println("the employee details");
        System.out.println("Book Id: "+ book_id);
        System.out.println("Book title: "+ title);
        System.out.println("Book price: "+ price);
    }

    void change_price(double newprice)
    {
        System.out.println("enter new price: ");
        newprice=sc.nextDouble();
        price=newprice;
    }
}
