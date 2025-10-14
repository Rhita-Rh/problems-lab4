package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;
    //getters and setters

    public Subject(String code, String title, Instructor instructor){
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public String normalizedCode(){
        return this.code.toUpperCase().trim();
    }

    public String properTitle(){
        String[] split_arr = this.title.split(" ");
        String newTitle = "";
        for(String word:split_arr){
            word = word.substring(0,1).toUpperCase().concat(word.substring(1));
            newTitle = newTitle.concat(word).concat(" ");
        }

        return newTitle;
    }

    public boolean isIntroCourse(){
        if(normalizedCode().startsWith("INTRO") || properTitle().contains("Intro")){
            return true;
        }
        return false;
    }

    public String syllabusLine(){
        StringBuilder myString = new StringBuilder(normalizedCode());
        myString.append("-").append(properTitle())
                .append("Instructor: ").append(instructor.getLastName())
                .append(" ").append(instructor.getFirstName());

        return myString.toString();
    }


}
