import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class    Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String userdate = scanner.nextLine();//taking input
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(userdate, formatter);
        LocalDate today= LocalDate.now(); // today date 

       Long number_ofdays=ChronoUnit.DAYS.between(date, today);//counting days
       System.out.printf("The number of days since %s is %d %n",date,number_ofdays);
       
    }
}
