package lesson_6;

import java.util.*;

public class StudentManager {
    private Set<Student> students;

    public StudentManager() {
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> removeStudentsWithLowGrades() {
        List<Student> removedStudents = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();

        System.out.println("Удаление студентов с баллом ниже 3");

        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.calculateAverageGrade();

            if (averageGrade < 3.0) {
                removedStudents.add(student);
                iterator.remove();
            }
        }
        return removedStudents;
    }

    public List<Student> promoteQualifiedStudents() {
        List<Student> promotedStudents = new ArrayList<>();

        System.out.println("Перевод студентов на следующий курс с баллом выше 3");

        for (Student student : students) {
            double averageGrade = student.calculateAverageGrade();

            if (averageGrade >= 3.0) {
                int oldCourse = student.getCourse();
                student.promoteToNextCourse();
                promotedStudents.add(student);
                System.out.printf("\nПереведен: %s с %d на %d курс ",
                        student.getName(), oldCourse, student.getCourse(), averageGrade);
            }
        }
        return promotedStudents;
    }

    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты " + course + " курса");

        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.printf("• %s (Группа: %s, Средний балл: %.2f)%n",
                        student.getName(), student.getGroup(), student.calculateAverageGrade());
                found = true;
            }
        }
    }

    public void printAllStudents() {
        {
            for (Student student : students) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public Set<Student> getStudents() {
        return new HashSet<>(students);
    }
}
