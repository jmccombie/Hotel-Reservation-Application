package model;

public class Room implements IRoom {
    String roomNumber;
    Double price;
    RoomType enumeration;

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Room Type: " + enumeration + ", Price: $" + price;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public boolean isFree() {
        return true;
    }
}
