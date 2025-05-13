import java.util.Scanner;

public class PlaceValueOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int v1 = n1/1000;
        System.out.println(v1);

        int n2 = sc.nextInt();
        int v2 = n2/100;
        int n = v2%10;
        System.out.println(n);

        int n3 = sc.nextInt();
        int s1=10;
        s1 = (n3 % 10 < s1) ? n3%10 : s1;
        n3 /= 10;
        int sum = (v1 * n) + s1;
        System.out.println("Final Result : "+sum);
    }
}
