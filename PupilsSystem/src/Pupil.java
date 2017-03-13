import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Pupil {
    private String name;
    private int cash;
    private String parentName;

    public String getName() {
        return name;
    }

    public String getParentName() {
        return parentName;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public Pupil(String name, String parentName) {
        this.name = name;
        this.parentName = parentName;
    }

    ArrayList<Food> menu = new ArrayList<Food>();

    public void buyFood(String foodName, Pupil pupil){
       for(int i = 0; i < menu.size(); i++) if(menu.get(i).getName().equals(foodName)) pupil.cash -= menu.get(i).getPrice();
    }
}
