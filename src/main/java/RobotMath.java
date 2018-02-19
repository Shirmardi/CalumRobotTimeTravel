import java.util.Scanner;

public class RobotMath {

    RobotCommand currentYear = new RobotCommand();

    public int futureTravel() {

        System.out.println("How many years in the future would you like to travel?");

        Scanner scan = new Scanner(System.in);
        int amountOfYears = scan.nextInt();

        currentYear.setNewCurrentYear(amountOfYears + currentYear.getCurrentYear());

        System.out.println("Success! You are now in the year " + currentYear.getNewCurrentYear());
        System.out.println(currentYear.getNewCurrentYear());
        return currentYear.getNewCurrentYear();

    }


    public void pastTravel() {

    }
}
