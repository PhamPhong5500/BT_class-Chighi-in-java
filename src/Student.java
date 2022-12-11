import java.security.PublicKey;

public class Student {
    private String name;
    private  String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }
    public  void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String display() {
        return "I'am " + this.name + " at" + this.classes;
    }
}
