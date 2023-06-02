package Vehicle;
public class Car extends Vehicle {
    
    boolean isconvertable;
    int numGears;
    
    public void print(){
        super.print();
        System.out.println("Car isConvertable : " + isconvertable);
        System.out.println("No Of Gears in Car : " + numGears);
    }
}
