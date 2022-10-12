public class Person {

    protected String name;
    protected String lastName;
    protected int count = 1;

    public Person(String name, String lastName, int count) {
        this.name = name;
        this.lastName = lastName;
        this.count = count;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", count=" + count +
                '}';
    }


    public int getCount() {
        return count;
    }
}