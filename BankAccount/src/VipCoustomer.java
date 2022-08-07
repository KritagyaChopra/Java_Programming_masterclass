public class VipCoustomer {
    private String name;
    private String emailAddress;
    private  long creditLimit ;
    public VipCoustomer(){
        this("krit","email@constructor",1000000);
        System.out.println("empty");
    }
    public VipCoustomer(String name ,String emailAddress){
        this(name , emailAddress , 99);
        System.out.println("2 parameters");
    }
    public  VipCoustomer(String name , String emailAddress , long creditLimit){
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit =creditLimit;
        System.out.println("all parameters");
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getCreditLimit() {
        return creditLimit;
    }
}
