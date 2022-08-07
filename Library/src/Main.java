public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("4 legs",false);
        Table table = new Table(20,20);
        Ac ac = new Ac("local",false);
        ComputerRoom computerRoom = new ComputerRoom(10,5);
        ReadingRoom readingRoom =new ReadingRoom(chair, table,ac);
        Library library = new Library(readingRoom,computerRoom);
        library.goToLibrary();
        ac.setOnSwitch(true);
        library.goToLibrary();
    }



}
