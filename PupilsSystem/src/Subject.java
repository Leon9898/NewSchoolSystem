import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Subject {
    private ArrayList<Integer> marks;
    private String name;

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void setMark(ArrayList<Integer> marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Subject(String name, ArrayList<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }
}
