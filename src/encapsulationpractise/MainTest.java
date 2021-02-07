package encapsulationpractise;

public class MainTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        person.setFirstName("Daniel");
        person.setLastName("Persson");

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
