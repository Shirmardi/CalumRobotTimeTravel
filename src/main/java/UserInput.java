import java.awt.*;
import java.util.Scanner;

public class UserInput {

    RobotCommand roboInfo = new RobotCommand();
    RobotMath roboMath = new RobotMath();
    RobotMath pastYear = new RobotMath();


    public void userInput() {

        boolean validCommand = false;



        if (validCommand == false) {


            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();

            switch (i) {
                case 1:
                    System.out.println(roboInfo.getName());
                    validCommand = true;
                    break;


                case 2:
                    System.out.println("I was created in  " + roboInfo.getBuildYear());
                    validCommand = true;
                    break;


                case 3:
                    System.out.println("The current year is " + roboInfo.getCurrentYear());

                    validCommand = true;
                    break;

                case 4:
                    roboMath.futureTravel();
                    validCommand = true;
                    System.out.println("the new current year is " + roboInfo.getNewCurrentYear());
                    break;


                default:
                    System.err.println("Error, invalid command");
                    break;
            }

        }



        roboInfo.powerUp();
        userInput();
    }


}





