package Jobsheet1;

public class GasStove extends Stove {
    private String gasType;
    private int burnerCount;

    public void setGasType(String type) {
        gasType = type;
    }
    public void setBurnerCount(int count) {
        burnerCount = count;
    }

    @Override
    public void printInfo() {
        System.out.println("GAS STOVE");
        System.out.println("==========");
        super.printInfo();
        System.out.println("Gas Type        : " + gasType);
        System.out.println("Burner Count    : " + burnerCount);
    }
}
