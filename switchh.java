import java.util.*;
public class switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double p,b,h;
        float r,area,perimeter;
        while (true) {
            
        
        System.out.println("chose the number\n1. for pythogorous\n2. for area of circle\n3. for perimeter of circle\n4. for exit: ");
        menu=sc.nextInt();
       

        switch (menu) {
            case 1:
                System.out.print("for pythagorous therom\nenter value of p and b respectively: ");
                p=sc.nextDouble();
                b=sc.nextDouble();
                h=Math.sqrt(p*p+b*b);
                System.out.println("value of hypotanous is "+ h);    
            break;
            case 2:
                System.out.print("for area of circle enter radius of circle: ");
                r=sc.nextFloat();
                area=3.14f*r*r;
                System.out.println("the area of citcle is "+area);
            break;
            case 3:
                System.out.print("for perimeter of circle enter radius of circle: ");
                r=sc.nextFloat();
                perimeter = 2*3.14f*r;
                System.out.println("the peremeter of citcle is "+perimeter);
            break;
            case 4:
                System.out.println("program terminated");
                System.exit(menu);
                break;
            default:
                System.out.println("invalid number passed");
                break;
        }
    }
    
    
        // sc.close();
    }
}
