import classes.Person;
import classes.Park;

public class Lesson_8 {
    public static void main(String[] args) {
        // Создание массива сотрудников
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager", "petrov@mailbox.com", "892312313", 35000, 35);
        persArray[2] = new Person("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "892312314", 40000, 25);
        persArray[3] = new Person("Kuznetsov Kuzma", "Designer", "kuznetsov@mailbox.com", "892312315", 45000, 28);
        persArray[4] = new Person("Smirnov Smir", "Tester", "smirnov@mailbox.com", "892312316", 32000, 29);

        // Вывод информации о каждом сотруднике
        for (Person person : persArray) {
            person.printInfo();
            System.out.println();
        }

        // Создание объектов аттракционов
        Park park = new Park();
        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 - 18:00", 500);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "09:00 - 22:00", 300);
        Park.Attraction bumperCars = park.new Attraction("Bumper Cars", "11:00 - 20:00", 200);

        // Вывод информации об аттракционах
        rollerCoaster.printInfo();
        System.out.println();
        ferrisWheel.printInfo();
        System.out.println();
        bumperCars.printInfo();
    }
}