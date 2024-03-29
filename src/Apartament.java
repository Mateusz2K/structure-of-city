import java.util.Scanner;

public class Apartament extends  CityObject implements Bulding{
    @Override
    public void createRooms() {
        if (countOfRooms > 0){
            Room[] rooms = new Room[countOfRooms];
            Scanner input = new Scanner(System.in);
            for (int i = 1; i <= countOfRooms; i++){
                System.out.print("Name of " + i + "# room: ");
                String nameRoom = input.next();
                rooms[i-1] = new Room(nameRoom);
            }
            input.close();
        }
    }

    private int countOfRooms;
    private int floorLvl;
    private int price;
    private int windows;

    public Apartament(float size, String name, String location, int countOfRooms, int floorLvl, int price, int windows) {
        super(size, name, location);
        this.countOfRooms = countOfRooms;

        this.floorLvl = floorLvl;
        this.price = price;
        this.windows = windows;
    }

}
