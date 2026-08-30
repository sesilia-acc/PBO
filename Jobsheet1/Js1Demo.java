package Jobsheet1;

public class Js1Demo {
    public static void main(String[] args) {
        Blender blender1 = new Blender();
        Airpods airpods1 = new Airpods();
        GasStove gasStove1 = new GasStove();
        ElectricStove electricStove1 = new ElectricStove();

        blender1.setBrand("Turbo Blender");
        blender1.speedAcceleration(5);
        blender1.printInfo();

        System.out.println();
        airpods1.setBrand("Basseus BP 1 Pro");
        airpods1.setVolume(58);
        airpods1.printInfo();

        System.out.println();
        gasStove1.setBrand("Sanken");
        gasStove1.setStatus(false);
        gasStove1.setGasType("LPG");
        gasStove1.setBurnerCount(2);
        gasStove1.printInfo();

        System.out.println();
        electricStove1.setBrand("Airlux");
        electricStove1.setStatus(false);
        electricStove1.setPowerWatts(275);
        electricStove1.heatUp(6);
        electricStove1.printInfo();
    }
}
