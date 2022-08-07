public class Car extends Vehicle{
    private int numberOfGears;
    private int currentGear;

    public Car(boolean gear, int numberOfGears) {
        super(gear);
        numberOfGears = numberOfGears;
    }

    @Override
    public String moving(int speed) {
        return super.moving(speed);
    }

    public int changingGear( int currentGear){
        if(currentGear<numberOfGears){
            System.out.println("gear changed");
            return 1;
        }
        System.out.println("gear not changed" );
        return 0;
    }
}
