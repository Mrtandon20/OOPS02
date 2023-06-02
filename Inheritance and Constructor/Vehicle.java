package Vehicle;
public class Vehicle{

    protected String color;
    private int maxspeed;

    public Vehicle(int maxspeed){
        this.maxspeed = maxspeed;
        System.out.println("Vehicle Constructor");
    }
    // public Vehicle(){
    //     System.out.println("Vehicle Constructor");
    // }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public void print(){
        System.out.println("Color Of Vehicle : " + color);
        System.out.println("Maxspeed of Vehicle : " + maxspeed);
    }

} 
