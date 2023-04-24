package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
//        Motorboat boat = new Motorboat();
//        boat.makeNoise();
//        PequePeque pequePeque = new PequePeque();
//        pequePeque.makeNoise();
//        pequePeque.breakingDownNoise();

        Garage garage = new Garage();
        garage.vehicles = new Vehicle[3];
        garage.vehicles[0] = new Motorcycle();
        garage.vehicles[1] = new Motorboat();
        garage.alarmCascade();
    }
}
