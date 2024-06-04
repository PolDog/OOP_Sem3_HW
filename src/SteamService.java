import java.util.ArrayList;
import java.util.Collections;


public class SteamService {
    ArrayList<Steam> steams;

    public SteamService() {
        steams = new ArrayList<>();
    }

    public void addSteam(Steam steam) {
        steams.add(steam);
    }

    public void sort() {
        System.out.println("до сортировки по уменьшению "+steams);
        Collections.sort(steams, new SteamComparator());
//        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);  //то же, но в виде лямбда
//        Collections.sort(arrayList, (s1,s2)->{return s1.id-s2.id;}); //расшифровка лямбда
        System.out.println("после         по уменьшению "+steams);
    }
}
