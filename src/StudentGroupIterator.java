import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup;
    private int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override

    public boolean hasNext() {
        int lengthStudents = getStudents().length;
        return index < lengthStudents;
    }

    private Student[] getStudents() {
        String[] names = studentGroup.students.toString().split(" ");
        Student[] students = new Student[names.length];
        int count = 0;
        for (String name : names) {
            students[count] = new Student(name,count);
            count++;
        }
        return students;
    }

    @Override
    public Student next() {
        Student[] students = getStudents();
        return students[index++];
    }
}
