import java.util.ArrayList;

public class ReportCard {

    public static void main (String[] args){

        Subjects subjects = new Subjects();
        Subjects.Grades grades = subjects.new Grades();

        subjects.sentence1();
        ArrayList<String> classes = new ArrayList<>();

        classes.add("English");
        classes.add("Biology");
        classes.add("Algebra");
        classes.add("Art");

        for(int i = 0; i < classes.size(); i++){
            System.out.println("\t" + classes.get(i));}

        grades.sentence2();
       int[] results = {85, 90, 95, 84};
        if (results.length > 0) {
            int i = 0;
            do {
                System.out.println("\t" + results[i]);
                i++;
            } while (i < results.length);
        }



    }
}
