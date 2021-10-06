package OOPConcepts;

public class Student extends Person {
    int stud_id;
    double subject1, subject2, subject3;
    String major;

    Student(int id, String name, int age, char gender, double s1, double s2, double s3)
    {
        super(name,age,gender);
        this.stud_id=id;
        this.subject1=s1;
        this.subject2=s2;
        this.subject3=s3;
    }

    public void display()
    {
        System.out.println("Id " + this.stud_id);
        super.display();
        System.out.println("Subject1 score: " + this.subject1);
        System.out.println("Subject2 score: " + this.subject2);
        System.out.println("Subject3 score: " + this.subject3);
    }






}
