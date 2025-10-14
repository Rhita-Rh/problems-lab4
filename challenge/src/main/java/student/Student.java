package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, Major.COMPUTERSCIENCE);
    }

    // Getters and Setters
    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s",getLastName().toUpperCase(), getFirstName());
    }

    @Override
    public String toString(){
        return this.cne + " " + getLastName() + " " + getFirstName();
    }
}

