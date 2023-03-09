package chuk;

public abstract class Email {
    private final String firstName;
    private final String lastName;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMailboxCapacity() {
        return 500;
    }


    public abstract String departMent();
    public abstract String generatePassword();

    public abstract String displayUserInfo ();
}
