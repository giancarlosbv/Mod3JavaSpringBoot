public class Student {
    String sFName;
    String sLName;
    String sEmail;
    float subj1;
    float subj2;
    float subj3;

//for parametized constructor WE HAVE TO CREATE  an empty constructor. Not needed if no parametized constructor
    public Student(){
    
    }

    public Student(String sFName, String sLName, String sEmail, float subj1, float subj2, float subj3){
        this.sFName = sFName;
        this.sLName = sLName;
        this.sEmail = sEmail;
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        
    }
    
    void display() {
        System.out.println("First Name: " + this.sFName);
        System.out.println("Last Name: " + this.sLName);
        System.out.println("Email: " + this.sLName);
        System.out.println("Subject 1: " + this.subj1);
        System.out.println("Subject 2: " + this.subj2);
        System.out.println("Subject 3: " + this.subj3);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
