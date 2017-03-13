import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Parent {
    private String name;
    private ArrayList<String> childName;

    public String getName(){
        return name;
    }

    public ArrayList<String> getChildName(){
        return getChildName();
    }

    public Parent(String name, ArrayList<String> childName){
       this.name = name;
       this.childName = childName;
    }
    ArrayList<Pupil> pupilsList = new ArrayList<Pupil>();
    ArrayList<ArrayList<Subject>> subectsAndMarksOfPupils = new ArrayList<ArrayList<Subject>>();

    public ArrayList<Subject> checkMarksOfPupil(String childName){
        String pupilName = childName;
        int pupilNumberInList = 0;
        for(int i = 0; i < pupilsList.size(); i++) if(pupilsList.get(i).getName().equals(pupilName)) pupilNumberInList = i;

        return subectsAndMarksOfPupils.get(pupilNumberInList);
    }


}
