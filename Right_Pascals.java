public class Right_Pascals {
    public static void main(String[] args) {
        int n=8;
        System.out.println("My method");
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int a=1;a<n;a++)
        {
            for (int b=n-1;b>=a;b--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Method1");
        int i,rows=5,j;
        for (i=rows-1; i>=0; i--)
        {
            for(j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }

    }
}
