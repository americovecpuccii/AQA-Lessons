package lesson_3;

public class Park {
    private String name;
    private String address;
    private String dateOfFoundation;

    public Park(String name, String address, String dateOfFoundation) {
        this.name = name;
        this.address = address;
        this.dateOfFoundation = dateOfFoundation;
    }

    public class Attractions {
        private String nameOfAttraction;
        private String timeOfWork;
        private String price;

        public Attractions (String nameOfAttraction, String timeOfWork, String price) {
            this.nameOfAttraction = nameOfAttraction;
            this.timeOfWork = timeOfWork;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + nameOfAttraction +
                    "\n Время работы: " + timeOfWork + "\n Цена: " + price);
        }
    }
}
