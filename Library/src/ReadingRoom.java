public class ReadingRoom {
    private Chair chair;
    private Table table;
    private Ac ac;

    public ReadingRoom(Chair chair, Table table, Ac ac) {
        this.chair = chair;
        this.table = table;
        this.ac = ac;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }

    public Ac getAc() {
        return ac;
    }
}
