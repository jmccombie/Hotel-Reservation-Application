package model;

public class FreeRoom extends Room{
    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;

        price = 0.0;

        }

    @Override
    public String toString() {
        return "*Free room* Room number: " + roomNumber + ", Room Type: " + enumeration;

    }
}

