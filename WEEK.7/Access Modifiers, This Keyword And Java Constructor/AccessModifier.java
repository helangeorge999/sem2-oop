public class AccessModifier{
    public static void main(String[] args) {
        AccessExample ae1 = new AccessExample();
        //ae1.intValue = 100;
        ae1.strValue = "Test";
        ae1.boolVal = true;
        //ae1.doPrivate();
        ae1.setPrivate();
      
        Task1 t1 = new Task1();
        t1.fillNameAddress("Helan George ", 10 );
        t1.address = " Ktm";
        t1.printDetail();
        
    }
}
class Task1{
    // create a provide variable for Name, Age
    // create public variable for Address
    // Make a function to fill data for Name and Age
    // Make a function to print Name, Age and Adress

    // create a provide variable for Name, Age
    private String name;
    private int age;

    // create public variable for Address
    public String address;

    // Function to fill data for name and age
    void fillNameAddress (String name,  int age){
        this.name = name;
        this.age = age;
    }
    void printDetail(){
        System.out.println(name + ", " + age + " and " + address);
    }
    
}
class ThisExample{
    private int length; //" this.length" in this class represent this length;
    private int breadth;
    void fillData(int length, int breadth){
        this.length = length; // this represent current class attrubute
        this.breadth = breadth; // the breadth without this represent the args/parameter of function
        
    }
}
class AccessExample{
    private int intValue; // can only be used only inside class scope
    public String strValue; // can be used anywhere
    boolean boolVal; // automatically default, can be used only inside a same package/folder

    // similarly can be used in function
    private void doPrivate(){
        System.out.println("I can be accessed only in this class");
    }

    public void doPublic(){
        System.out.println("I can be accessed from anywhere");
    }

    void doDefault(){
        System.out.println("I can be accessed from current package/folder");

    }
    //private can be used in class
    void setPrivate(){
        intValue = 100; //private can be accessed here
        doPrivate(); // same goes to private functions
    }
}