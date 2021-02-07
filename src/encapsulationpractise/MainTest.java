package encapsulationpractise;

public class MainTest {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        person.setFirstName("Daniel", new Name());
        person.setLastName("Persson", new Name());

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
