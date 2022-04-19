package lesson8.zad2;

import java.util.Arrays;

public class SpecialStudent extends CollegeStudent{
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey,
                          String email, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    @Override
    public String toString() {
        return "SpecialStudent{" +
                "collegeName='" + collegeName + '\'' +
                ", rating=" + rating +
                ", id=" + id +
                ", secretKey=" + secretKey +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", coursesTaken=" + Arrays.toString(coursesTaken) +
                ", age=" + age +
                '}';
    }
}

