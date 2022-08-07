public class Room {
    private Tables table;
    private Door door;
    private Light light;

    public Room(Tables table, Door door, Light light) {
        this.table = table;
        this.door = door;
        this.light = light;
    }
    public void pressSwitch(){
        light.onLight();
    }
}
