package lesson_6;

public class StudentDemonstration {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        initializeStudents(manager);

        System.out.println("Список студентов");
        manager.printAllStudents();

        for (int course = 1; course <= 3; course++) {
            StudentManager.printStudents(manager.getStudents(), course);
        }

        manager.removeStudentsWithLowGrades();

        System.out.println("Список студентов после удаления");
        manager.printAllStudents();

        manager.promoteQualifiedStudents();

        System.out.println("\nСписок студентов после перевода");
        for (int course = 1; course <= 4; course++) {
            StudentManager.printStudents(manager.getStudents(), course);
        }
    }

    private static void initializeStudents(StudentManager manager) {

        Student student1 = new Student("Иван Иванов", "101", 1);
        student1.addGrade("Химия", 5);
        student1.addGrade("Физика", 4);
        student1.addGrade("Математика", 5);
        manager.addStudent(student1);

        Student student2 = new Student("Мария Петрова", "102", 2);
        student2.addGrade("Химия", 2);
        student2.addGrade("Физика", 2);
        student2.addGrade("Математика", 3);
        manager.addStudent(student2);

        Student student3 = new Student("Елена Козлова", "103", 2);
        student3.addGrade("Химия", 4);
        student3.addGrade("Физика", 3);
        student3.addGrade("Математика", 4);
        manager.addStudent(student3);

        Student student4 = new Student("Дмитрий Дмитриев", "104", 3);
        student4.addGrade("Химия", 2);
        student4.addGrade("Физика", 2);
        student4.addGrade("Математика", 2);
        manager.addStudent(student4);

    }
}

