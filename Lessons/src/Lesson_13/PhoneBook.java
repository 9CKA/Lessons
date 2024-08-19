import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Person> persons = new ArrayList<>();

    public void add(String lastName, String phoneNumber) {
        for (Person person : persons) {
            if (person.getLastName().equals(lastName)) {
                person.addPhoneNumber(phoneNumber);
                return;
            }
        }

        persons.add(new Person(lastName, phoneNumber));
    }

    public List<String> get(String lastName) {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getLastName().equals(lastName)) {
                result.addAll(person.getPhoneNumbers());
            }
        }
        return result;
    }
}

class Person {
    String lastName;
    List<String> phoneNumbers = new ArrayList<>();

    Person(String lastName, String... phoneNumbers) {
        this.lastName = lastName;
        if (phoneNumbers != null) {
            this.phoneNumbers.addAll(Arrays.asList(phoneNumbers));
        }
    }

    void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    String getLastName() {
        return lastName;
    }

    List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}