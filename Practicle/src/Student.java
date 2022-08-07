import java.util.Objects;
import java.util.*;
class NullValueCustomException extends Exception {

    public NullValueCustomException(String message) {
        super(message);
    }
}
public class Student {
    private String name ;
    private int rollNumber ;
    private String email ;
    private long mobile ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() && getMobile() == student.getMobile() && getName().equals(student.getName()) && getEmail().equals(student.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRollNumber(), getEmail(), getMobile());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

}

