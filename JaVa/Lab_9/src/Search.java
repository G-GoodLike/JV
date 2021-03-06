import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Student[] students = {
                new Student("К.И.Демиденко", 3),
                new Student("В.Г.Доценко", 5),
                new Student("С.М.Мишустин", 4),
        };
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Введите Фамилию:");
            String name = a.next();
            Student res = null;
            for (Student student : students) {
                if (name.equals(student.getName())) {
                    res = student;
                    break;
                }
            }
            if (res == null)
                throw new StudentNotFoundException();
            System.out.println(res);
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка! Студент не найден");
        }
    }
}
