package lesson_4;

    public class Bowl {
        private int food;

        public Bowl(int initialFood) {
            this.food = initialFood;
        }
        public Bowl() {
            this(0);
        }
        public int getFood() {
            return food;
        }
        public void addFood(int amount) {
                          food += amount;
                System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + food + "еды");

            }
        }




