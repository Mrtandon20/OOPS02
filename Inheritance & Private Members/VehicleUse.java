public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        // v1.maxspeed= 100;
        v1.setMaxspeed(100);
        v1.color = "Yellow";
        v1.print();

        Car c1 = new Car();
        c1.isconvertable = true;
        c1.color ="Black";
        c1.setMaxspeed(200);

        c1.print();

        c1.Carprint();
    }
    
}
