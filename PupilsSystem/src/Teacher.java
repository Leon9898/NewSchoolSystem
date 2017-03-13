import java.util.ArrayList;

/**
 * Created by Leon Kostyushko on 12.03.2017.
 */
public class Teacher {
    private String name;
    private String subject;

    public String getSubject() {
        return subject;
    }

    public String getName(){
        return name;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    ArrayList<ArrayList<Subject>> subectsAndMarksOfPupils = new ArrayList<ArrayList<Subject>>();

    public void setNewMark(int numberOfPupil, Teacher teacher, int mark){
        String subject = teacher.subject;
        ArrayList<Subject> allSubjectsOfCurrentPupil = new ArrayList<Subject>();
        for(int i = 0; i < allSubjectsOfCurrentPupil.size(); i++){
            if (allSubjectsOfCurrentPupil.get(i).getName().equals(subject)) allSubjectsOfCurrentPupil.get(i).getMarks().add(mark);
        }
    }

}
