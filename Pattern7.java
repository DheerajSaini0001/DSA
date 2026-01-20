import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
System.out.println("Enter the number of stars");
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
        int i,j,s;
        for(i=0;i<n;i++){
            for( s=0;s<=n-i-1;s++){
                System.out.print(" ");

            }
            for(j=0;j<=i;j++){
                  System.out.print("*");
            }
              System.out.println();
        }
        for (i=0;i<n;i++){
            for ( s=0;s<=i+1;s++){
                  System.out.print(" ");
            }
            for(j=(n-1);j>i;j--){
                  System.out.print("*");
            }
              System.out.println("");
        }

}
}