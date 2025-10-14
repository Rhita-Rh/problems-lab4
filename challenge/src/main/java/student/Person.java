package student;

public class Person {
    private static int nextId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Person(String lastName, String firstName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = telephone;
        this.email = email;
    }

    public Person(){
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Person.nextId = nextId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return this.id + " " + this.lastName + " " + this.firstName;
    }
}

