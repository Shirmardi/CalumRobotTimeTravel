public class RobotCommand {

    private String name = "I'm Roger the robot!";
    private int buildYear = 1990;
    private int currentYear = 2020;
    private int newCurrentYear;

    public void sayHi() {
        System.out.println("Hello human");
    }

    public void powerUp() {

        System.out.println("What would you like to do?");
        System.out.println("1: Name \n2: Build year \n3: Current year \n4: Travel to future\n5: Travel to past");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getNewCurrentYear() {
        return newCurrentYear;
    }

    public void setNewCurrentYear(int newCurrentYear) {
        this.newCurrentYear = newCurrentYear;
    }
}
