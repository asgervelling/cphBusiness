package task2;

public class Main {
    public static void main(String[] args) {

        Room room0 = new Room(2, 2, 3);
        Room room1 = new Room(1, 3, 2);
        Room room2 = new Room(2, 4, 4);

        Room[] rooms = { room0, room1, room2 };

        Building smallHouse = new Building(rooms, 1, 4, false);
        System.out.println(smallHouse);
    }
}
