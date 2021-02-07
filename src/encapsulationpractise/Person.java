package encapsulationpractise;

public class Person {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Name name) throws Exception {
        name.setLastName(lastName);
        this.lastName = name.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName, Name name) throws Exception {
        name.setFirstName(firstName);
        this.firstName = name.getFirstName();
    }
}
