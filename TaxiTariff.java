import java.util.Scanner;

public class TaxiTariff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Taxi Number: ");
        String taxi_no = sc.nextLine();
        System.out.println("Enter the distance you covered (in kms): ");
        int km = sc.nextInt();
        int new_km;
        if(km<5){
            System.out.println("The Tariff : 100");
        } else if (km>5 && km<10) {
            new_km = km * 10;
            System.out.println("The Tariff: "+new_km);
        } else if (km>10 && km<20) {
            new_km = km * 8;
            System.out.println("The Tariff: "+new_km);
        } else if (km>20 && km<25) {
            new_km = km * 7;
            System.out.println("The Tariff: "+new_km);
        } else if (km>25) {
            new_km = km * 5;
            System.out.println("The Tariff: "+new_km);
        }
    }
}
