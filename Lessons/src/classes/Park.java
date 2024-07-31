package classes;

public class Park {
    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        // Конструктор
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Attraction Name: " + name);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price);
        }
    }
}
