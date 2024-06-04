public class Student implements Comparable<Student> {
    public String name;
    public int id;

    public Student(String name,int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return o.name.length() - this.name.length();
    }
}
