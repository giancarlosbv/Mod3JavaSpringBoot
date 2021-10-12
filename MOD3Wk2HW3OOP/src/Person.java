public class Person {

    //create instance variables

    String pName;
    int pAge;
    char pGender;

    //create a person class with a parameterized constructor

    //first create an empty constructor

    public Person() {

    }

    //heres the parameterized constructor

    public Person(String pName, int pAge, char pGender){
        this.pName = pName;
        this.pAge = pAge;
        this.pGender = pGender;
    }
   



    //Here's an instance method, it will display information about the person class.

    void display(){
        System.out.println("Name: " + this.pName);
        System.out.println("Age " + this.pAge);
        System.out.println("Gender: " + this.pGender);
    }

    //static can be called without object references
    //this is a class method
    //void means our method is not returning anything

    static void info() {
        System.out.println("Information about class...");
        System.out.println("===================");
    }

 //create 2 classes Employee and Student as subclasses of the Person class as a super class


    public static void main(String[] args) throws Exception {
        



    }
}
