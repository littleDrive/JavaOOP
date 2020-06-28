import model.Student;

/**
 * @author ozm
 * @date 2020/6/28 - 23:05
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student(123, "zero", 23, 100);
        System.out.println("id: " + student.getId());
        System.out.println("name: " + student.getName());
        System.out.println("age: " + student.getAge());
        System.out.println("grade: " + student.getGrade());
    }
}
