import java.util.Scanner;

public class rangeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i=M; i<=N; i++){
            sum+=i;
        }
        System.out.println("Final Sum: "+sum);
    }
}
