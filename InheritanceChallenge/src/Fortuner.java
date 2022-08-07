public class Fortuner extends Car {
    private String registerNumber;
    private  int speed;
    private  int currentGear;

    @Override
    public String moving(int speed) {
        speed=this.speed;
        return super.moving(speed);
    }

    @Override
    public int changingGear( int currentGear) {
        return super.changingGear(this.currentGear);
    }

    public Fortuner(boolean gear, String registerNumber,int speed , int currentGear) {
        super(gear, 6);
        this.currentGear = currentGear;
        this.speed = speed;
        this.registerNumber = registerNumber;
    }
}
