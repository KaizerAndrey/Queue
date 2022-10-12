import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("Ivan", "Tsarevich", 3));
        persons.add(new Person("Evpatiy", "Kolovrat", 4));
        persons.add(new Person("Alyosha", "Popovic", 1));
        persons.add(new Person("Ilya", "Muromets", 5));
        persons.add(new Person("Dobrynya", "Nikitich", 2));

        return persons;
    }

    public static void print(List<Person> list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println((j + 1) + "." + list.get(j));
        }
    }

    public static void main(String[] args) {
        List<Person> persons = generateClients();

        print(persons);

        Queue<Person> clientsQueue = new LinkedList<>();
        for (Person person : persons) {
            clientsQueue.add(person);
        }

        while (!clientsQueue.isEmpty()) {
            Person person = clientsQueue.poll();

            if (person.count > 0) {
                person.count -= 1;
                System.out.println(
                        person.name + " " + person.lastName +
                                " прокатился на атракционе у клиента осталось билетов " + person.getCount()
                );
            }

            if (person.count > 0) {
                clientsQueue.add(person);
            }
        }

        System.out.println("Билеты закончились");
    }
}


