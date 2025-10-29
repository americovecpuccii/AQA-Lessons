package lesson_6;

import java.util.List;

public class PhoneDemonstration {
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        System.out.println("Добавление записей");
        directory.add("Петров", "+7-912-234-56-78");
        directory.add("Сидоров", "+7-913-345-67-89");
        directory.add("Иванов", "+7-914-456-78-90");
        directory.add("Петров", "+7-915-567-89-01");

        System.out.println();

        directory.printAll();

        List<String> sidorovPhones = directory.get("Сидоров");

        List<String> petrovPhones = directory.get("Петров");

        System.out.println();

    }
}
