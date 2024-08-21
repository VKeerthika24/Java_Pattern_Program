import java.util.Scanner;

public class Downward_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Method1");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Method2");
        int i,j,rows=5;
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
