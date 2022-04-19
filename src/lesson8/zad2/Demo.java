package lesson8.zad2;

public class Demo {
    public Student createHighestParent (String firstName, String lastName, int group, Course[] coursesTaken){
        return new Student(firstName, lastName, group, coursesTaken);
    }
    public SpecialStudent createLowestParent(String firstName, String lastName, int group, Course[] coursesTaken,
                                             long secretKey, String email, String collegeName, int rating, long id){
        return new SpecialStudent(firstName, lastName, group, coursesTaken, secretKey, email, collegeName, rating, id);
    }

}
