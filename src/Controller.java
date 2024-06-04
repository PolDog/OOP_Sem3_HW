public class Controller {
    StudentGroupService studentGroupService;
    SteamService steamService;

    public Controller() {
        studentGroupService = new StudentGroupService();
        steamService = new SteamService();
    }

    public void removeStudents(String name, StudentGroup group) {
        studentGroupService.removeStudentsFIO(group,name);
    }

    public void sort(StudentGroup group) {
        studentGroupService.sort(group);
    }
}
