
package leapyear;
import java.util.Scanner;
/**
 * @author Furkan Aydemir, deerborg
 * @since 2024
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Leap Year Calculation");
        System.out.println("---------------------------------");
        
        // Year value received from the user
        Scanner userValue = new Scanner(System.in);
        System.out.println("year");
        int yearValue = userValue.nextInt();
        int leapYear = yearValue % 4;
        
        // If the year is divisible or not divisible by 4
        switch (leapYear) {
            case 0:
                System.out.println("Leapyear");
                break;
            default:
                System.out.println("Not Leapyear");
                break;
        }
    }
}
