package week11;

public class Polymorphism {
    public static void main(String[] args) {
        
    mathOperation mo= new mathOperation();
    System.out.println(mo.add(10,20));
    System.out.println(mo.add(10, 20,30));
    mo.add();

    //method overigin
    //polymorphisim allow Parent class to hold child class object
    Document d1= new Document();
    d1.print("Dell XPS");
    Document d2= new MsWord();
    d2.print("MS Word");
    //when doing so, though we are creating 
    // from childclass mswrd() we 
    // only funtion// atrinbute from document
    Document d3= new Office365();
    d3.print("Office 365");
}
}

//method overloading
//some functionn with difference in paramter
class mathOperation{
    int add(int num1, int num2){
        return num1 + num2;
    }

//1.Method overloading with change in number of parament
int add(int num1,int num2,int num3){
    return num1+num2+num3;
}
//2.Method overloading with change in data type
double add(double num1,double num2){
    return num1+num2;
}
//note: the chage in retunr type doesnot determin overloading
//method overloadng only determine wiht cahnge in parament
// also, changing the variable name is also nnot allowed
//eg int add(int a, int b)-> not allowed
///as function with 2 int is already made

void add(){
    System.out.println("invalid OPeration");
}
}

//Method overriding
//when childclass has the same function as Parent class
class Document{
    public void print(String printer){
        System.out.println("documment printing");
    }
    // method overriding can only be done in child lass
    class MsWord extends Document{
        
        //overrinfing can be done in multi layer inheritance
        @Override
        public void print(String printer){
            System.out.println("Ms word printer");
        }
    }
    class Office365 extends MsWord{
        boolean internet= true;
        //overrigin can be done in multi layer inheritance
        @Override
        public void print(String printer){
            System.out.println("online printer");
        }
    }
}