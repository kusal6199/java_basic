import java.net.SocketPermission;

public class typeconversion {
    public static void main(_String[] args) {
        byte b;
        int i =257;
        double d = 323.142;
        System.out.println("\n Conversion of int to byte:");
        b=(byte) i;
        System.out.println("i and b"+ i+" "+b);
        System.out.println("\n Conversion of double to int:");
        i= (int)d;
        System.out.println("\nd and i"+d+" "+i);
        System.out.println("\nConversion of double to byte");
        b=(byte)d;
        System.out.println("\nd and b"+d+" "+b);


    }

    
}
