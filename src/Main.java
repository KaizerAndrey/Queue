import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class Main {
        public static List<Person> generateClients(List<Person> temp) {

            temp.add(new Person("Ivan", "Tsarevich", 3));
            temp.add(new Person("Evpatiy", "Kolovrat", 4));
            temp.add(new Person("Alyosha", "Popovic", 1));
            temp.add(new Person("Ilya", "Muromets", 5));
            temp.add(new Person("Dobrynya", "Nikitich", 2));
            return temp;
        }

    public static void print(List<Person> list) {
        for (int j = 0; j < list.size(); j++) {
            System.out.println((j + 1) + "." + list.get(j));
        }
    }

    public static void main(String[] args) {
        List<Person> person = new LinkedList<>();

        print(generateClients(person));

        ArrayDeque<Person> client = new ArrayDeque<>();
        for (Person value : person) {
            client.addLast(value);
        }

        while (!client.isEmpty()) {
            Person p = client.getFirst();

            if (p.count > 0) {
                p.count -= 1;
                System.out.println(p.name + " " + p.lastName + " прокатился на атракционе у клиента осталось билетов "
                        + p.getCount());
                client.addLast(p);
            }
            client.poll();
        }
        System.out.println("Билеты закончились");
    }
}

