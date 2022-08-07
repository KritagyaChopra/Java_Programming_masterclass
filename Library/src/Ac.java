public class Ac {
    private String company;
    private  boolean onSwitch;

    public boolean isOnSwitch() {
        return onSwitch;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setOnSwitch(boolean onSwitch) {
        this.onSwitch = onSwitch;
    }

    public String getCompany() {
        return company;
    }

    public Ac(String company, boolean onSwitch) {
        this.company = company;
        this.onSwitch = onSwitch;
    }
    public  void acPowerCondition(){
        if(isOnSwitch()){
            System.out.println("AC is on");
        }else {
            System.out.println("Ac is off");
        }
    }
}
