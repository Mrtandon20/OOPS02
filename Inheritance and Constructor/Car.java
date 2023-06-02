package Vehicle;
public class Car extends Vehicle {
    
    boolean isconvertable;
    int numGears;
    
    public Car(int numGears , int maxspeed){
        super(maxspeed);
        this.numGears = numGears;
        System.out.println("Car Constructor");
    }


    public void print(){
        super.print();
        System.out.println("Car isConvertable : " + isconvertable);
        System.out.println("No Of Gears in Car : " + numGears);
    }
}
