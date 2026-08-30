package Jobsheet1;

public class ElectricStove extends Stove {
    private int powerWatts;
    private int heatLevel;

    public void setPowerWatts(int power) {
        powerWatts = power;
    }
    public void heatUp(int increment) {
        heatLevel += increment;
        if (heatLevel > 5) {
            heatLevel = 5;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("ELECTRIC STOVE");
        System.out.println("==========");
        super.printInfo();
        System.out.println("Power (Watts)   : " + powerWatts);
        System.out.println("Heat Level      : " + heatLevel);
    }
}
