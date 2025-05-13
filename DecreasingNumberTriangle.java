import java.util.Scanner;

public class DecreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        //If "<" symbol, keep increment
        //If ">" symbol, keep decrement
        for(i = n; i>=1;i--){
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
