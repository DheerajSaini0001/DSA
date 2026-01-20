import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
System.out.println("Enter the number of stars");
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
        int i,j;
        for (i=0;i<n;i++)
        {
            for(j=0;j<=i;j++){
                System.err.print("*");
            }
            System.err.println();
        }
         for (i=0;i<n;i++)
        {
            for(j=(n-1);j>i;j--){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
