package student;

public class Test {
    public static void main(String[] args) {
        Major computerScience = Major.COMPUTERSCIENCE;  //
        Major architecture = new Major("33", "Architecture");

        Student student1 = new Student("SAFI", "Amal", "06", "ee@gmail.com", "22885676");
        Student student2 = new Student("ALAMI", "Samir", "06", "ee@gmail.com", "23585976");
        Student student3 = new Student("BENJ", "Said", "06", "ee@gmail.com", "23585977");
        Student student4 = new Student("KHALID", "Khalid", "06", "ee@gmail.com", "23585978");
        Student student5 = new Student("NORA", "Nora", "06", "ee@gmail.com", "23585979");

        Student student6 = new Student("RH", "Rhita", "06", "ee@gmail.com", "23585776", architecture);
        Student student7 = new Student("NAAAAjat", "Najat", "06", "ee@gmail.com", "20085776", architecture);
        Student student8 = new Student("YASSIR", "Yassir", "06", "ee@gmail.com", "20085777", architecture);
        Student student9 = new Student("LINA", "Lina", "06", "ee@gmail.com", "20085778", architecture);

        // Display computer science students
        computerScience.displayStudents();
        System.out.println();
        architecture.displayStudents();
        System.out.println();

        //testing new methods
        //get studentcount
        System.out.println("StudentCount of " + computerScience.getName() + " is: " + computerScience.getStudentCount());
        System.out.println("StudentCount of " + architecture.getName() + " is: " + architecture.getStudentCount());

        System.out.println();

        System.out.println("Formatted Name: " + student1.getFullNameFormatted());
        System.out.println();
        //find a student
        architecture.findStudentByCNE("23585776").getFullNameFormatted();
        System.out.println();

        //remove a student
        System.out.println(computerScience.getStudentListAsString());
        System.out.println("After removing a student with cne 23585979:");
        System.out.println(computerScience.removeStudent("23585979"));
        System.out.println(computerScience.getStudentListAsString());

        System.out.println();
        //getOccupancyRate
        computerScience.getOccupancyRate();
        System.out.println();
        architecture.getOccupancyRate();




    }
}

