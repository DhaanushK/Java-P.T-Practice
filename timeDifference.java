import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class timeDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Enter first date-time (yyyy-MM-dd HH:mm:ss): ");
        String firstInput = sc.nextLine();

        System.out.println("Enter second date-time (yyyy-MM-dd HH:mm:ss): ");
        String secondInput = sc.nextLine();


        LocalDateTime dateTime1 = LocalDateTime.parse(firstInput, format);
        LocalDateTime dateTime2 = LocalDateTime.parse(secondInput, format);
        Duration duration = Duration.between(dateTime1, dateTime2);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        System.out.println("Difference: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
