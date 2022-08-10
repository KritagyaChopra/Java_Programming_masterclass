import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Player implements Saveable {
    private String name;

    private int hitPoints;
    private int strength;
    private String weapon;



    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(0 , name);
        arrayList.add(1, String.valueOf(hitPoints));
        arrayList.add(2, String.valueOf(strength));
        arrayList.add(3, weapon);
        return arrayList;
    }

    @Override
    public void read(List<String> savedList) {
        if(savedList!=null && savedList.size()>0) {
            this.name = savedList.get(0);
            this.hitPoints = Integer.parseInt(savedList.get(1));
            this.strength = Integer.parseInt(savedList.get(2));
            this.weapon = savedList.get(3);
        }
    }
}
