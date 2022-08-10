import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;


    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name  +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add(0 , name);
        arrayList.add(1, String.valueOf(hitPoints));
        arrayList.add(2, String.valueOf(strength));
        return arrayList;
    }

    @Override
    public void read(List<String> savedList) {
        if(savedList!=null && savedList.size()>0){
            this.name = savedList.get(0);
            this.hitPoints = Integer.parseInt(savedList.get(1));
            this.strength  = Integer.parseInt(savedList.get(2));
        }
    }
}
