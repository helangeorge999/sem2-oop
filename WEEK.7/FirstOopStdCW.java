public class FirstOopStdCW {
    public static void main(String[] args) {
      
        Student student = new Student();
        student.firstName="Helan";
        student.lastName="George";
        student.studentId=17;
        student.age=18;

        System.out.println("Full Name: " + student.fullName());

        student.description();

        System.out.println("Is over Eighteen: " + student.overEighteen());
    }
}
// Create a class Student
// attribute 
// - firstName
// - lastName
// - studentId
// - age
// function
// - fullName()=> return firstName + lastName
// - description() => print fullName and studentId
// - overEighteen() => return boolean of weather student is over 18
// Make object of your detail
// print your fullname
// call description
// print if you are overEighteen or not

class Student{
    String firstName;
    String lastName;
    int studentId;
    int age;

    String fullName(){
        return firstName + " " + lastName;
    }

    void description(){
        System.out.println("Full Name: " + fullName() + " Student ID: " + studentId);
        
    }
    boolean overEighteen(){
        return age > 18;
    }
}