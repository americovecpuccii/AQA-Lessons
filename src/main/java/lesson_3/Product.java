package lesson_3;
public class Product {
    private String name;
    private String productionDate;
    private String countryOfOrigin;
    private Integer price;
    private Boolean statusOfTheBooking;

    public Product(String name, String productionDate, String countryOfOrigin,
                   Integer price, Boolean statusOfTheBooking) {
        this.name = name;
        this.productionDate = productionDate;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.statusOfTheBooking = statusOfTheBooking;
    }
public void printInfo () {
    System.out.println("Наименование:" + name + "\n Дата производства: " +
            productionDate + "\n Производитель:" + countryOfOrigin +
            "\n Цена:" + price + "\n Статус заказа:" + statusOfTheBooking);
}
}