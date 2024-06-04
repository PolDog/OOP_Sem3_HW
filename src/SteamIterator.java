import java.util.Iterator;

public class SteamIterator implements Iterator<StudentGroup> {
    Steam steam;
    private int index = 0;

    public SteamIterator(Steam steam) {
        this.steam = steam;
    }

    @Override
    public boolean hasNext() {
        return index<steam.getSteamSize();
    }

    @Override
    public StudentGroup next() {

        return steam.getGroups().get(index++);
    }
}
