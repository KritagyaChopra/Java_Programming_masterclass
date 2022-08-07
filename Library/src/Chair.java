public class Chair {
    private String type;
    private boolean occupied;

    public Chair(String type, boolean occupied) {
        this.type = type;
        this.occupied = occupied;
    }

    public String getType() {
        return type;
    }

    public boolean isOccupied() {
        return occupied;
    }
    public boolean isAvailable(){
        return !occupied;

    }
}
