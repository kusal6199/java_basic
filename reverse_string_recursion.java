public class reverse_string_recursion {
    public static void printRev(String a,int indx){
        if (indx==0) {
            System.out.println(a.charAt(0));
            return;
        }
        System.out.print(a.charAt(indx));
        printRev(a, indx-1);

    }
    public static void main(String[] args) {
        String a="Kushal";
        printRev(a,a.length()-1);
        
    }
}
