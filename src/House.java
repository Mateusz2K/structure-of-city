import java.io.IOException;
import java.util.Scanner;

public class House extends PublicObject implements Bulding{
    private int layout;
    private int countOfRooms;
    private boolean isGarden;

    public House(float size, String name, String location, String design, String material, int layout, int countOfRooms, boolean isGarden) {
        super(size, name, location, design, material);
        this.layout = layout;
        countOfRooms = countOfRooms;
        createRooms();
        this.isGarden = isGarden;
    }

    public House(float size, String name, String location, int layout, int countOfRooms, boolean isGarden) {
        super(size, name, location);
        this.layout = layout;
        this.countOfRooms = countOfRooms;
        createRooms();
        this.isGarden = isGarden;
    }

    public House(float size, String name, String location, String design, String material, int countOfRooms, boolean isGarden) {
        super(size, name, location, design, material);
        this.countOfRooms = countOfRooms;
        createRooms();
        this.isGarden = isGarden;
    }

    public House(float size, String name, String location, int countOfRooms, boolean isGarden) {
        super(size, name, location);
        this.countOfRooms = countOfRooms;
        createRooms();
        this.isGarden = isGarden;
    }

    @Override
    public void createRooms() {
        if (this.countOfRooms > 0){
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
}
