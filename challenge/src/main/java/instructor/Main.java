package instructor;

public class Main {
    public static void main(String[] args) {

        // Create an instructor
        Instructor instructor = new Instructor("John1", "Smith1", "0660", "john.smith@email.com", "  AB 123 ");

        // Create subject
        Subject subject = new Subject(" cs-101 ", "introduction to java", instructor);
        instructor.setSubject(subject);

        // cleanEmployeeNumber()
        System.out.println("Clean employee number: " + instructor.cleanEmployeeNumber());
        // Expected: "AB123"

        // normalizedCode()
        System.out.println("Normalized code for subject1: " + subject.normalizedCode());
        // Expected: "CS-101"

        // properTitle()
        System.out.println("Proper title: " + subject.properTitle());

        // summaryLine() in Instructor
        System.out.println("Summary line: " + instructor.summaryLine());
        // Expected: Instructor[employeeNumber=AB123, lastName=Smith, firstName=John]

        // isIntroCourse()
        System.out.println("Is Intro in subject title or code? " + subject.isIntroCourse());


        // toCard() in Instructor
        System.out.println(instructor.toCard());

        // syllabusLine() in Subject
        System.out.println("Syllabus line: " + subject.syllabusLine());

        // displayName() in Instructor
        System.out.println(instructor.displayName());

    }
}
