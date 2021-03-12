package task2;

public class Building {
    final private Room[] rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    @Override
    public String toString() {
        StringBuilder roomsString = new StringBuilder();
        boolean oddBuilding = false;
        for (Room r : rooms) {
            roomsString.append(r.toString());
            if (numberOfFloors > rooms.length) {
                roomsString.append("This is an odd building");
            }
        }
        return String.format("%s with %d rooms, %d floors.\n" + roomsString,
                            (isOfficeBuilding ? "Office building" : "Building"), rooms.length, numberOfFloors);
    }
}
