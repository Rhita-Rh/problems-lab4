package instructor;
import student.Person;

public class Instructor extends Person{
    private String employeeNumber;
    private Subject subject;

    public Instructor(String lastName, String firstName, String phone, String email, String employeeNumber){
        super(lastName, firstName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    //getters and setters of subject
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String cleanEmployeeNumber(){
        return this.employeeNumber.trim().replace(" ", "");
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]\".", cleanEmployeeNumber(), getLastName(), getFirstName());
    }

    public String toCard(){
        StringBuilder myString = new StringBuilder("Instructor\n");
        myString.append("----------\n")
                .append("Employee #:").append(cleanEmployeeNumber())
                .append("\nName   :").append(getLastName())
                .append(", ").append(getFirstName())
                .append("\nEmail    :").append(getEmail())
                .append("\nPhone    :").append(getPhone());

        return myString.toString();

    }

    public String displayName(){
        StringBuilder myString = new StringBuilder("Instructor: ");
        if(getFirstName() == null){
            myString.append(getLastName());
        }
        else{
            myString.append(getLastName()).append(" ").append(getFirstName());
        }

        return myString.toString();
    }


}
