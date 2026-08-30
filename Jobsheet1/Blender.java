package Jobsheet1;

public class Blender {
    private String brand;
    private int speed;

    public void setBrand(String brandName) {
        brand = brandName;
    }
    public void speedAcceleration(int increment) {
        speed += increment;
        if (speed > 3) {
            speed = 3;
        }
    }
    public void printInfo() {
        System.out.println("BLENDER");
        System.out.println("==========");
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    }
}
