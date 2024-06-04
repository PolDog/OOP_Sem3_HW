import java.util.ArrayList;
import java.util.Collections;

public class StudentGroupService {
    public void removeStudentsFIO(StudentGroup group, String name) {
        System.out.println("Удаляем " + name);
    }

    public void sort(StudentGroup group) {
        ArrayList<Student> arrayList = group.getStudents();
        System.out.println(arrayList);
        Collections.sort(arrayList, new StudentComparator());
//        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id);  //то же, но в виде лямбда
//        Collections.sort(arrayList, (s1,s2)->{return s1.id-s2.id;}); //расшифровка лямбда
        System.out.println(arrayList);
    }
}
