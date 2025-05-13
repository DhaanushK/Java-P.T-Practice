import java.util.Scanner;
public class differenceFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        if(num1>num2){
            float difference = num1 - num2;
            System.out.println("Result : "+difference);
        }else{
            float difference = num2 - num1;
            System.out.println("Result: "+difference);
        }
    }
}
