import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    StringBuilder students;
    int id;

    public StudentGroup(int id) {
        students = new StringBuilder();
        this.id = id;
    }

    public int getGroupSize() {
        String[] size = students.toString().split(" ");

        return size.length;
    }

    public ArrayList<Student> getStudents() {
        ArrayList<Student> list = new ArrayList<>();
        String[] name = students.toString().split(" ");
        for (int i = 0; i < name.length; i++) {
            list.add(new Student(name[i],i));
        }
        return list;
    }

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    public int getId() {
        return id;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
