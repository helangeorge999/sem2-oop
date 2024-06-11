public class InheritanceConstructor {
    public static void main(String[] args) {
        TShirt ts1 = new TShirt();
        ts1.nameDifference("New");
        TShirt ts2 = new TShirt("My Shirt");

    }
}

class Shirt{
    String name = "Parent Shirt"; //super.name
    String type;
    Shirt(){
        System.out.println("Parent Constructor");
    }
    Shirt (String name){
        this.name = name;
        System.out.println("Parent Constructor with String params");
    }
}

class TShirt extends Shirt{
    String name= "Parent Shirt"; //this.name
    TShirt(){
        //default parent constructor is called automatically
        //super() or Shirt()
        super ("Parent");
        System.out.println("Child Constructor");
    }
    //overloading
    //same name function with different logic/ parameters
    TShirt(String name){
        this.name = name;
        System.out.println();
    }
    TShirt(int number){

    }
    TShirt(String name, int number){

    }
    void nameDifference(String name){
        System.out.println("Param Name " + name);
        System.out.println("Class name " + this.name);
        System.out.println("Parent name " + super.name);
    }
}

