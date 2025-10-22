package lesson_4;

public class CatsDogs {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик");
        Cat cat1 = new Cat("Барсик");

        dog1.run(150);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(15);

        cat1.run(150);
        cat1.run(250);
        cat1.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        Bowl bowl = new Bowl(10);
        bowl.addFood(15);

        Cat[] cats = {
                new Cat("Вася"),
                new Cat("Шерхан"),
                new Cat("Мурзик"),
        };
        System.out.println("\n--- Кормление котов (в миске " + bowl.getFood() + " еды) ---");
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println("\n--- Состояние сытости котов ---");
        for (Cat cat : cats) {
            String status = cat.isFull() ? "сыт" : "голоден";
            System.out.println(cat.name + ": " + status);
        }
    }
}