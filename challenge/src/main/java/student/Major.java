package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    public static final int capacity= 50;

    public Major(String code, String name) {
        this. id = nextId++;
        this.code = code;
        this.name = name;
        this.studentCount = 0;
        this.students = new Student[0];
    }

    public static final Major COMPUTERSCIENCE = new Major();

    public Major() {
        this("23", "ComputerScience");
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(this.studentCount == 0){
            students = new Student[1];
            students[0] = s;
            studentCount++;
        }
        else if(this.studentCount<capacity){
            Student[] newStudents = new Student[studentCount+ 1];
            //copying existing students
            int i = 0;
            for(Student student : this.students){
                newStudents[i] = student;
                i++;
            }
            newStudents[studentCount] = s;  //add the new student
            this.students = newStudents;
            this.studentCount++;
        }
        else{
            System.out.println(name + " Major cannot exceed 50 students");
        }
    }

    // Getters and setters
    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Major.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("The list of students in the " + this.name + " is:");
        int i =1;
        for(Student student: this.students){
            System.out.println(i + ". " + student.toString());
            i++;
        }
    }

    // findStudentByCNE(String cne)
    public Student findStudentByCNE(String cne){
        for(Student student : students){
            if(student.getCne().equals(cne)){
                return student;
            }
        }
        return null;
    }

    // getStudentCount()
    public int getStudentCount(){
        return this.studentCount;
    }

    // removeStudent(String cne)
    public boolean removeStudent(String cne){
        Student myStudent = findStudentByCNE(cne);
        if (myStudent != null){
            Student[] newArray = new Student[studentCount-1];
            int index =0;
            for(int i=0; i<studentCount; i++){
                if(students[i] != myStudent){
                    newArray[index] = students[i];
                    index ++;
                }
            }

            students = newArray;
            studentCount --;
            return true;
        }
        else{
            return false;
        }
    }

    // display the percentage of occupied capacity
    public void getOccupancyRate(){
        double pourcentage = ((double) this.studentCount/capacity) * 100;
        System.out.println(this.name + " capacity: " + capacity + " students");
        System.out.println("Current enrollment: " + this.studentCount + " students");
        System.out.println("Occupancy rate = " + pourcentage + "%");
    }

    // getStudentListAsString()
    public String getStudentListAsString(){
        StringBuilder myString = new StringBuilder("");
        for(int i = 0; i<studentCount; i++){
            myString.append(i+1).append(". ")
                    .append(students[i].getCne())
                    .append(" ").append(students[i].getFullNameFormatted())
                    .append("\n");
        }
        return myString.toString();
    }

}
