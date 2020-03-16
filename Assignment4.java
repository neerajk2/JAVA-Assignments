/**
 * Given the signup date and the current date, provide the allowable date range for the form date.
 *
 * Input - First line is an integer n as the number of inputs to be passed.
 * Next, n lines are n input for the program in the format dd-mm-yyyy dd-mm-yyyy Each line has two dates separated by space
 * where the first date in signup date and the second date is the current date.
 *
 * Output - Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Assignment4 {

    public String dateRange (LocalDate signUp, LocalDate currDate) {
        String result = "";
        if (signUp.isAfter(currDate)) {
            result = "No range";
            return result;
        } else {
            int years = currDate.getYear() - signUp.getYear();
            LocalDate anniversary = signUp.plusYears(years);
            LocalDate rangeStart = anniversary.minusDays(30);
            LocalDate rangeEnd = anniversary.plusDays(30);
            if (rangeStart.compareTo(currDate) > 0){
                anniversary = anniversary.minusYears(1);
                rangeStart = anniversary.minusDays(30);
                rangeEnd = anniversary.plusDays(30);
                result = rangeStart.toString() +" "+ rangeEnd.toString();
            }
            else if (rangeStart.compareTo(currDate) <= 0 && rangeEnd.compareTo(currDate) >= 0){
                result = rangeStart.toString() +" "+ currDate.toString();
            }
            else if (rangeStart.compareTo(currDate) < 0 && rangeEnd.compareTo(currDate) < 0){
                result = rangeStart.toString() +" "+ rangeEnd.toString();
            }
            return result;
        }

    }
    //Driver code
    public static void main (String[] args) {
        Assignment4 a4 = new Assignment4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            try {
                LocalDate signUp = LocalDate.parse(scan.next(), format);
                LocalDate currDate = LocalDate.parse(scan.next(), format);
                String range = a4.dateRange(signUp, currDate);
                System.out.println(range);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date Format -- enter dd-mm-yyyy");
            }
        }
    }
}
