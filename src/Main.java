import java.util.Random;

public class Main {
    static int id = 0;

    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println("HW 3");
        StudentGroup studentGroup1 = generateGroup(1);
        StudentGroup studentGroup2 = generateGroup(2);
        StudentGroup studentGroup3 = generateGroup(3);
        StudentGroup studentGroup4 = generateGroup(4);
        StudentGroup studentGroup5 = generateGroup(5);
        StudentGroup studentGroup6 = generateGroup(6);

        Steam steam1 = new Steam(1);
        Steam steam2 = new Steam(2);
        Steam steam3 = new Steam(3);

        steam1.addGroup(studentGroup1);
        steam1.addGroup(studentGroup2);
        steam2.addGroup(studentGroup3);
        steam3.addGroup(studentGroup4);
        steam3.addGroup(studentGroup5);
        steam3.addGroup(studentGroup6);

        printSteam(steam1);
        printSteam(steam2);
        printSteam(steam3);
        SteamService steamService = new SteamService();
        steamService.addSteam(steam1);
        steamService.addSteam(steam2);
        steamService.addSteam(steam3);
        steamService.sort();

    }

    public static void printStudentGroup(StudentGroup group) {
        System.out.println("Группа " + group.getId() + " размер " + group.getGroupSize() + " человек.");
        for (Student student : group) {
            System.out.println("    студент " + student);
        }
    }

    public static void printSteam(Steam steam) {
        System.out.println("Поток " + steam.getId() + " размер " + steam.getSteamSize() + " групп.");
        for (StudentGroup group : steam) {
            System.out.println("    группа " + group.getId());
        }
    }

    public static StudentGroup generateGroup(int id) {
        StudentGroup group = new StudentGroup(id);
        Random random = new Random();
        int amountStudents = random.nextInt(15);
        Student student;
        for (int i = 0; i < amountStudents; i++) {
            student = new Student(getName(), id);
            group.addStudent(student);
            id++;

        }
        return group;
    }

    public static String getName() {

        String names = "Абрамов_И,Агапова_С,Алексеев_П,Андреев_А,Андреева_А,Аникина_А,Анисимов_Р,Антонов_В,Астафьев_Ф,Афанасьева_Д,Баранова_В,Баранова_К,Белова_К,Белоусов_А,Беляев_А,Беляев_П,Бессонова_К,Большаков_В,Борисов_М,Борисова_А,Борисова_А,Бородин_Ф,Васильева_А,Гаврилов_А,Горлов_Д,Григорьев_С,Губанова_В,Дмитриев_В,Жаров_Г,Жуков_А,Журавлев_А,Журавлева_Ю,Иванов_А,Иванова_О,Ильина_В,Ковалев_А,Козлов_А,Козлова_А,Кондратьев_Г,Копылова_Н,Королев_Е,Коротков_М,Кудрявцева_В,Кудряшова_К,Кузнецов_А,Кузьмин_Д,Кузьмина_А,Куликов_А,Лапина_В,Лукьянов_М,Макаров_И,Маркелова_В,Мартынов_И,Матвеева_П,Минин_Р,Миронова_С,Миронова_А,Митрофанова_М,Михайлов_Н,Моисеева_В,Морозова_М,Муравьев_И,Некрасова_У,Нечаева_В,Николаев_И,Николаев_Г,Николаева_М,Николаева_А,Новиков_Я,Окулов_М,Орлов_М,Плотников_И,Попов_К,Попова_В,Попова_Е,Попова_В,Прокофьев_А,Родин_О,Румянцев_М,Семенов_Д,Сергеева_А,Серова_А,Сизов_Р,Соколов_А,Соколова_С,Соколова_В,Соловьева_А,Степанова_У,Степанова_А,Суворов_П,Суслова_А,Тарасова_М,Филатова_Т,Филимонова_М,Фомин_Я,Харитонова_П,Цветков_И,Чернышева_М,Юдина_А,Яковлева_А";
        String[] namesArray = names.split(",");
        Random random = new Random();
        int index = random.nextInt(100);
        return namesArray[index];
    }
}
