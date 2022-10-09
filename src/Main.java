import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());

        while (!queueAttraction.isEmpty()) {
            Person currentPerson = queueAttraction.poll();
            System.out.printf("%s %s сошёл с аттракциона, имея - %d билет(а/ов)\n",
                    currentPerson.getName(),
                    currentPerson.getSureName(),
                    currentPerson.getQuantityTickets());

            int quantityTickets = currentPerson.getQuantityTickets();

            if (quantityTickets > 0) {
                System.out.printf("%s %s решил прокатиться на аттракционе, имея - %d билет(а/ов)\n",
                        currentPerson.getName(),
                        currentPerson.getSureName(),
                        currentPerson.getQuantityTickets());

                currentPerson.setQuantityTickets(--quantityTickets);
                queueAttraction.offer(currentPerson);
            }
        }
        System.out.println("Билеты закончились");
    }

    private static List<Person> generateClients() {
        return List.of(
                new Person("Ivan", "Tsarevich", 3),
                new Person("Evpatiy", "Kolovrat", 4),
                new Person("Alyosha", "Popovich", 1),
                new Person("Ilya", "Muromets", 5),
                new Person("Dobrynya", "Nikitich", 2));


    }
}