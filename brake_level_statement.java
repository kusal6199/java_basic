public class brake_level_statement {
    public static void main(String[] args) {
        outer: for(int i=0;i<3;i++)
        {
            System.out.println(i);
            for(int j=0;j<100;j++)
            {
                if (j==13) {
                    break outer;
                }
                System.out.println("wont be displayed");
            }
        }
        System.out.println("i am out of loop");
    }
}
