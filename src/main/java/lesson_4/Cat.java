package lesson_4;

class Cat extends Animal {

    private static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;
    private boolean fullness; // сытость
    private final int FOOD_PORTION = 10;
    public Cat(String name) {
        super(name);
        this.fullness = false;
        catCount++;
    }

    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFood() >= FOOD_PORTION) {
            fullness = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + " в миске мало еды");
        }
    }

    public boolean isFull() {
        return fullness;
    }

    public static int getCatCount() {
        return catCount;
    }
}

