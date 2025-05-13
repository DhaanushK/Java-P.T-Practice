import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (YYYY-MM-DD):");
        String birthDateString = scanner.nextLine();
        LocalDate dateofBirth = LocalDate.parse(birthDateString);

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Calculating the period between the birthdate and the current date
        Period age = Period.between(dateofBirth, currentDate);

        // Displaying the age
        System.out.println("You are " + age.getYears() + " years old.");
    }
}