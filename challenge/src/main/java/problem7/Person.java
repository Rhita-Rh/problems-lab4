package problem7;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method: must be implemented by subclasses
    public abstract void display();

}