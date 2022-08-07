public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(10,10,4);
        Door door = new Door(dimension ,"wood");
        Light light = new Light(5  , 100);
        Tables table = new Tables(dimension , 2);
        Room theRoom = new Room(table ,door,light);
        theRoom.pressSwitch();
    }
}
