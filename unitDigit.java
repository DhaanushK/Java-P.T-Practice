import java.util.Scanner;

public class unitDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int unit = number%10;
        System.out.println(unit);
    }
}
