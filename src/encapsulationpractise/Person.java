package encapsulationpractise;

public class Person {
    private final Name name = new Name();

    public String getLastName() {
        return name.getLastName();
    }

    public void setLastName(String lastName) throws Exception {
        name.setLastName(lastName);
    }

    public String getFirstName() {
        return name.getFirstName();
    }

    public void setFirstName(String firstName) throws Exception {
        name.setFirstName(firstName);
    }
}
