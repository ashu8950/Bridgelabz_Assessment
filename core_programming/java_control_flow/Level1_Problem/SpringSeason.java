import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // month 1-12
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        //day 1 -31
        System.out.print("Enter day : ");
        int day = sc.nextInt();

        // Check if the date falls within the spring season (March 20 - June 20)
        boolean isSpring = (month == 3 && day >= 20) ||  (month == 4) || (month == 5) ||  (month == 6 && day <= 20); 

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        sc.close();
    }
}
