package Vehicle_temp;

import Vehicle.Vehicle;

public class Truck extends Vehicle{
    int maxLoadCapacity;

   public void print(){
    System.out.println("Truck Capacity : " + maxLoadCapacity);
    System.out.println("Truck Color : " + color);
    System.out.println("Truck maxspeed  : " + getMaxspeed());
    }
}
