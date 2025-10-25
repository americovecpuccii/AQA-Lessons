package lesson_3;

public class Attraction1 {
    public static void main(String[] args) {
        Park DisneyLand = new Park("DisneyLand","Paris","1956");
        Park.Attractions rollerCoaster = new Park("DisneyLand",
                "Paris",
                "1954").new Attractions("rollerCoaster",
                "10:00-12:00", "254");
       rollerCoaster.printInfo();
        }
    }


