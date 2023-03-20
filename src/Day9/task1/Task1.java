package Day9.task1;

public class Task1 {
    public static void main(String[] args) {
      Student student = new Student("Bob", "45");
      Teacher teacher = new Teacher("Alex", "Tech");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }

}
