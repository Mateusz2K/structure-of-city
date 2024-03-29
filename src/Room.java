import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Room extends CityObject{
    private int doors;
    private double price;
    private boolean isLighted;
    private int windows;
    private int electricalOtlets;
    private String flooring;


    public Room(float size, String name, double price, boolean isLighted, int windows, int electricalOtlets, String flooring) {
        super(size, name);
        this.doors  = 1;
        this.price = price;
        this.isLighted = isLighted;
        this.windows = windows;
        this.electricalOtlets = electricalOtlets;
        this.flooring = flooring;
    }

    public Room(float size, String name, int doors, double price, boolean isLighted, int windows, int electricalOtlets, String flooring) {
        super(size, name);
        this.doors = doors;
        this.price = price;
        this.isLighted = isLighted;
        this.windows = windows;
        this.electricalOtlets = electricalOtlets;
        this.flooring = flooring;
    }

    public Room(String name) {
        super(name);
    }

    public int getDoors() {
        return doors;
    }

    public double getprice() {
        return price;
    }

    public boolean isLighted() {
        return isLighted;
    }

    public int getWindows() {
        return windows;
    }

    public int getElectricalOtlets() {
        return electricalOtlets;
    }

    public String getFlooring() {
        return flooring;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public void setLighted(boolean lighted) {
        isLighted = lighted;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setElectricalOtlets(int electricalOtlets) {
        this.electricalOtlets = electricalOtlets;
    }

    public void setFlooring(String flooring) {
        this.flooring = flooring;
    }
    public void describeRoom() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pokój: " + getName());
        System.out.println("Podaj wymiar pokoju:");
        this.size = input.nextFloat();
        System.out.println("Jest oświetlony? t/n");
        String choose = input.next();
        if (choose.toUpperCase().charAt(0) == 'T'){
            this.isLighted = true;
        } else if (choose.toUpperCase().charAt(0) == 'N') {
            this.isLighted = false;
        }
        System.out.println("ile jest drzwi: ");
        this.doors = input.nextInt();
        System.out.println("Ile jest okien: ");
        this.windows = input.nextInt();
        System.out.println("ile jest gniazdek elektrycznych: ");
        this.electricalOtlets = input.nextInt();
        System.out.println("Jaki typ nawierzni");
        this.flooring = input.next();
        input.close();
    }

    @Override
    public String toString() {
        return "Room{" +
                "doors=" + doors +
                ", price='" + price + '\'' +
                ", isLighted=" + isLighted +
                ", windows=" + windows +
                ", electricalOtlets=" + electricalOtlets +
                ", flooring='" + flooring + '\'' +
                "} " + super.toStringWithoutLoc();
    }
}
