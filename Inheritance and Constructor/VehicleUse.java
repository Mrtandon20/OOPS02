package Vehicle;

// import Vehicle_temp.Truck;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(300);
        // v1.maxspeed= 100;
        // v1.setMaxspeed(100);
        v1.color = "Yellow";

        v1.print(); // Yellow , 300

        Car c1 = new Car(10 , 300);
        c1.isconvertable = true;
        c1.color ="RED";
        // c1.setMaxspeed(600);
        // c1.numGears = 5;

        c1.print();

    }
    
}
