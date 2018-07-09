import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomiser {
    public static ArrayList<String> choices;

    public Randomiser() {
        this.choices = new ArrayList();

        choices.add("Huey");
        choices.add("Dewey");
        choices.add("Louie");
    }


    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public int getCount(){
       return choices.size();
    }

    public static String randomise(){
        Collections.shuffle(choices);

        return choices.get(0);
    }
}
