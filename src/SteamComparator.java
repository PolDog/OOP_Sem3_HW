import java.util.Comparator;

public class SteamComparator implements Comparator<Steam> {
    @Override
    public int compare(Steam o1, Steam o2) {
        return o2.getSteamSize()-o1.getSteamSize();
    }
}
