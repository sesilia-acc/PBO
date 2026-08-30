package Jobsheet1;

public class Airpods {
    private String brand;
    private int volume;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void printInfo() {
        System.out.println("AIRPODS");
        System.out.println("==========");
        System.out.println("Brand           : " + brand);
        System.out.println("Volume          : " + volume);
    }
}
