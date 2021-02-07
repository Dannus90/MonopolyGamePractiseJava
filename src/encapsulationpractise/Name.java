package encapsulationpractise;

public class Name {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception {
        if(lastName.length() < 3 || lastName.equals(getFirstName())) {
            throw new Exception("Lastname must be 3 characters or longer and should not be equal to firstname.");
        }
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception {
        if(firstName.length() < 3 || firstName.equals(getLastName())) {
            throw new Exception("Firstname must be 3 characters or longer and should not be equal to lastname.");
        }
        this.firstName = firstName;
    }
}
