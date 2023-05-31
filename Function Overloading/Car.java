public class Car extends Vehicle {
    
    boolean isconvertable;
    int numGears;
    
    void print(){
        System.out.println("Color Of Car : " + color);
        System.out.println("Maxspeed of Car : " + getMaxspeed());
        System.out.println("Car isConvertable : " + isconvertable);
        System.out.println("No Of Gears in Car : " + numGears);
    }
}
