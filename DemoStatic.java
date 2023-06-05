public class DemoStatic {
    static int a =30;
    static int b;

    static void showData(int x){
        System.out.println("x= "+x);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    static{
        System.out.println("static built inatilized");
        b=a*4;
    }
    public static void main(String[] args) {
        showData(25);
    }
}
