import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=0; i<=n; i++){
            for (j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
