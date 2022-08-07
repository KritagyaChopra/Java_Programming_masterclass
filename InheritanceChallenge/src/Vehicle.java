public class Vehicle {
    private boolean gear;

    public Vehicle(boolean gear) {
        this.gear = gear;
    }

    public String moving(int speed){
        return "Vehicle is moving at : "+speed;
    }
}
