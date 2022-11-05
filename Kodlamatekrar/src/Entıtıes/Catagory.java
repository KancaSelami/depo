package Entıtıes;

public class Catagory {
    private int catagoryId;
    private String catagorName;

    public Catagory() {
    }

    public Catagory(int catagoryId, String catagorName) {
        this.catagoryId = catagoryId;

        this.catagorName =catagorName;
    }

    public int getId() {
        return catagoryId;
    }

    public void setId(int id) {
        this.catagoryId = id;
    }

    public String getName() {
        return catagorName;
    }

    public void setName(String catagorName) {
        this.catagorName = catagorName;
    }
}
