import java.util.HashMap;
import java.util.Map;

public class ParkingPlace extends Vehicle {

    private final int parkingCapacity = 200;

    private Map<Vehicle, Integer> parkingPlace = new HashMap<>();

    public ParkingPlace(String name, String colour, int capacity) {
        super(name, colour, capacity);
    }

    public void addVehicle(Vehicle vehicle) throws InsufficientParkingPlace {
        if (parkingPlace.containsKey(vehicle) && getParkingCapacity() < 250) {
            parkingPlace.put(vehicle, (parkingPlace.get(vehicle) + 1));
        } else {
            throw new InsufficientParkingPlace("A parkoló megtelt, nem tudsz beállni");
        }
        System.out.println("Ennyi autó áll most a parkolóban: " +parkingPlace.put(vehicle, 1));
        System.out.println("A parkoló kapacitása: "+parkingCapacity);
    }

    public Vehicle findVehicle(String name) throws VehicleNotFoundException {
        for (Vehicle vehicle : parkingPlace.keySet()) {
            if (getName().equals(name)) {
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Nem találom az autót");
    }

    public void removeVehicle(String name) throws VehicleNotFoundException {
        Vehicle vehicle = findVehicle(name);
        if (!parkingPlace.containsKey(vehicle) && parkingPlace.get(vehicle) < parkingCapacity) {
            throw new VehicleNotFoundException("Nem találom az autót");
        }
        parkingPlace.replace(vehicle, parkingPlace.get(vehicle) - 1);
    }


    public int getParkingCapacity() {
        return parkingCapacity;
    }
}
