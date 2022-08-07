public class Library {
    private ReadingRoom glaReadingRoom ;
    private ComputerRoom glaComputerRoom ;

    public Library(ReadingRoom glaReadingRoom, ComputerRoom glaComputerRoom) {
        this.glaReadingRoom = glaReadingRoom;
        this.glaComputerRoom = glaComputerRoom;
    }
    public void goToLibrary(){
        if (glaReadingRoom.getAc().isOnSwitch()){
            System.out.println("go lib ac is on");
        }else {
            System.out.println("ac is not on , u want to go ?");
        }
    }
    public ReadingRoom getGlaReadingRoom() {
        return glaReadingRoom;
    }

    public ComputerRoom getGlaComputerRoom() {
        return glaComputerRoom;
    }
}
