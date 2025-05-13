import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hundred = 100;
        int fivehundred = 500;
        int thousand = 1000;

        System.out.println("Enter the number of 100 note you want: ");
        int h = sc.nextInt();
        System.out.println("Enter the number of 500 note you want: ");
        int fh = sc.nextInt();
        System.out.println("Enter the number of 1000 note you want: ");
        int t = sc.nextInt();

        int result1 = hundred * h;
        int result2 = fivehundred * fh;
        int result3 = thousand * t;

        int finalresult = result1 + result2 + result3;

        System.out.println("The total amount withdrawn: Rs. " +finalresult );
    }
}
