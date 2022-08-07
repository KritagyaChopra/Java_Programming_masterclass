public class ComputerRoom {
    private int numberOfComputer;
    private int occupiedComputer;

    public  void isComputerAvailable(){
        if(numberOfComputer>occupiedComputer){
            System.out.println("yes ");
        }
        else {
            System.out.println("No");
        }
    }
    public void setNumberOfComputer(int numberOfComputer) {
        this.numberOfComputer = numberOfComputer;
    }

    public void setOccupiedComputer(int occupiedComputer) {
        this.occupiedComputer = occupiedComputer;
    }

    public int getNumberOfComputer() {
        return numberOfComputer;
    }

    public int getOccupiedComputer() {
        return occupiedComputer;
    }

    public ComputerRoom(int numberOfComputer, int occupiedComputer) {
        this.numberOfComputer = numberOfComputer;
        this.occupiedComputer = occupiedComputer;
    }
}
