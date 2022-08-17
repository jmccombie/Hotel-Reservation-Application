package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.*;

public class ReservationService {

    private final Map<String, IRoom> rooms = new HashMap<>();
    static Set<Reservation> reservations;


    public void addRoom(IRoom room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public IRoom getARoom(String roomId) {
        return rooms.get(roomId);
    }
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        return reservation;
    }
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        /*
        Iterate through all rooms, creating a list/set of available rooms

        Criteria:
        1) if check-in before but check out not before checkInDate then = not available
        2) if check-in within range then = not available
        else = available

        return available rooms
        */

        // First create an ArrayList to store available rooms
        List<IRoom> freeRooms = new ArrayList<>();

        // Second, create a set to store reservedRooms and their applicable dates
        // Once populated, referencing this set will show rooms that are not reserved and, therefore, are available
        Set<IRoom> reservedRooms = getReservedRooms(checkInDate, checkOutDate);

        //For loop must check if a room is not in reservedRooms, then add it to freeRooms
        for (IRoom room : rooms) {
            if(!reservedRooms.contains(room)) {
                freeRooms.add(room);
            }
        }
        return freeRooms;
    }

    //Define getReservedRooms to return rooms based on criteria 1&2 above
    Set<IRoom> getReservedRooms(Date checkInDate, Date checkOutDate) {
        Set<IRoom> reservedRooms = new ArrayList<>();
        for (Reservation r : reservations) {
            IRoom room = r.getRoom();
            // create date1 and date2 variables of customer requested date range
            Date date1 = new Date()
            if (r.getDate() )
        }
    }

    public Collection<Reservation> getCustomersReservation(Customer customer) {
        return null;
    }
    public void printAllReservation(){
    }

    //Collections to store and retrieve a Reservation?
    static ArrayList<Reservation> reservation = new ArrayList <Reservation>();

    private static ReservationService reservationService = null;
    private ReservationService() {}

    public static ReservationService getInstance(){
        if (reservationService == null) {
            reservationService = new ReservationService();
        }
        return reservationService;
    }

    //Utilize default access modifier
/*    static void extendReservations(Reservation reservations) {
        reservations.add(reservation);
    }
    public static Reservation reserveARoom(Customer customer, IRoom iRoom, Date checkInDate, Date checkOutDate)
    {
        Reservation reservation = new Reservation(customer, iRoom, checkInDate, checkOutDate);
        // Extending reservations collection
        extendReservations(reservation);
        return reservation;
    }*/
}
