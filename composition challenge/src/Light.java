public class Light {
    private int lights;
    private int watts;

    public  void onLight(){
        System.out.println("Light turned on");
    }
    public int getLights() {
        return lights;
    }

    public int getWatts() {
        return watts;
    }

    public Light(int lights, int watts) {
        this.lights = lights;
        this.watts = watts;
    }
}
