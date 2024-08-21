import java.util.Scanner;

public class Left_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

