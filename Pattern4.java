import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
System.out.println("Enter the number of stars");
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
        int i,j;
        for (i=0;i<n;i++)
        {
            for (int s=0;s<=i;s++){
                System.err.print(" ");
            }
            
            for(j=5;j>i;j--){
                
                System.err.print("*");
            }
            
            System.err.println();
        }
        
    }
}
