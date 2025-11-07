package lesson_6;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> phoneBook;

    public PhoneDirectory() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());

        List<String> phones = phoneBook.get(lastName);
        phones.add(phoneNumber);

        System.out.printf("Добавлена запись: %s - %s%n", lastName, phoneNumber);
    }

    public List<String> get(String lastName) {
        List<String> phones = phoneBook.get(lastName);

        System.out.printf("Найдены номера для '%s': %s%n", lastName, phones);
        return new ArrayList<>(phones);
    }

    public void printAll() {
        System.out.println("Телефонный справочник");

        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }

    public int size() {
        return phoneBook.size();
    }

    public boolean contains(String lastName) {
        return phoneBook.containsKey(lastName);
    }
}
