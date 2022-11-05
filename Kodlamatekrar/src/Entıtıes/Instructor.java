package Entıtıes;

public class Instructor {
    private int id;
    private String instructorName;
    private String instructorlastName;

    public Instructor(int id, String instructorName, String instructorlastName) {
        this.id = id;
        this.instructorName = instructorName;

        this.instructorlastName = instructorlastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return instructorName;
    }

    public void setName(String name) {
        this.instructorName = instructorName;
    }

    public String getLastName() {
        return instructorlastName;
    }

    public void setLastName(String lastName) {
        this.instructorlastName = instructorlastName;
    }
}
