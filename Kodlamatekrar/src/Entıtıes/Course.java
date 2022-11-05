package Entıtıes;

public class Course {
    private int id;
    private  String courseName;

    private  Catagory catagory;

    public Course(int id, String courseName, Catagory catagory) {
        this.id = id;
        this.courseName = courseName;

        this.catagory = catagory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }




    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }
}
