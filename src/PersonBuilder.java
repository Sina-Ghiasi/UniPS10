import java.io.File;

public class PersonBuilder {
    private String fullname;
    private String id;
    private File picture;

    public PersonBuilder setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public PersonBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setPicture(File picture) {
        this.picture = picture;
        return this;
    }

    public Person createPerson() {
        return new Person(fullname, id, picture);
    }
}