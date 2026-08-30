package Jobsheet1;

public class Stove {
    private String brand;
    private boolean status;

    public void setBrand(String brandName) {
        brand = brandName;
    }
    public void setStatus(boolean st) {
        status = st;
    }
    public void printInfo() {
        System.out.println("Brand           : " + brand);
        System.out.println("Status          : " + (status ? "On" : "Off"));
    }
}
