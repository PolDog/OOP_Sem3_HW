import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Steam implements Iterable<StudentGroup>{
    ArrayList<StudentGroup> steam;
    int id;
    final static String text = "Поток ";

    public Steam(int id) {
        steam = new ArrayList<StudentGroup>();
        this.id = id;
    }

    public void addGroup(StudentGroup group) {
        steam.add(group);
    }

      public ArrayList<StudentGroup> getGroups() {
          return steam;
      }

    public int getSteamSize() {
        return steam.size();
    }


    public int getId() {
        return id;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new SteamIterator(this);
    }

    @Override
    public String toString() {

        return text+id;
    }
}
