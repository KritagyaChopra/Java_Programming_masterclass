public class Table {
    private double width;
    private double height;

    public Table(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
