import java.io.File;

public class Person {
    private String fullname;
    private String id;
    private File picture;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public Person(String fullname, String id, File picture) {
        this.fullname = fullname;
        this.id = id;
        this.picture = picture;
    }
}
