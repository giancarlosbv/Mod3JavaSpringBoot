public class Student extends Person {

    //create instance variables for student class
    int stud_id;
    double subject1, subject2, subject3;
    String major;

    //parameterized constructor
    Student(int id, String name, int age, char gender, double s1, double s2, double s3){
        super(name,age,gender);
    }
    
}
