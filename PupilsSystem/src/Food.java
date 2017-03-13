/**
 * Created by Leon Kostyushko on 13.03.2017.
 */
public class Food {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
