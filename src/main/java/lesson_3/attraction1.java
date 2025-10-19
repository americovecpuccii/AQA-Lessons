package lesson_3;

public class attraction1 {
    public static void main(String[] args) {
        park DisneyLand = new park("DisneyLand","Paris","1956");
        park.attractions rollerCoaster = new park("DisneyLand",
                "Paris",
                "1954").new attractions("rollerCoaster",
                "10:00-12:00", "254");
       rollerCoaster.printInfo();
        }
    }


