import java.util.Scanner;

public class SteelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Hardness: ");
        int hardness = sc.nextInt();
        System.out.println("Enter the Carbon content: ");
        float carbon = sc.nextFloat();
        System.out.println("Enter the Tensile Strength: ");
        int strength = sc.nextInt();

        if (hardness>60 && carbon>0.8 && strength>5700){
            System.out.println("Class A Steel");
        } else if (hardness>60 && carbon>0.8) {
            System.out.println("Class B Steel");
        } else if (hardness>60 && strength>5700) {
            System.out.println("Class C Steel");
        } else if (carbon>0.8 && strength>5700) {
            System.out.println("Class D Steel");
        } else if (hardness>60 || carbon>0.8 || strength>5700) {
            System.out.println("Class E Steel");
        }else{
            System.out.println("Class F Steel");
        }
    }
}
