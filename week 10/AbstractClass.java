public class AbstractClass {

    public static void main(String[] args) {
          // Creating objects of Samsung and Apple
          SmartPhone samsung = new Samsung();
          SmartPhone apple = new Apple();
  
          // Calling all functions of Samsung
          samsung.call();
          samsung.message();
          System.out.println("Samsung text: " + samsung.text("Hello from Samsung"));
  
          // Calling all functions of Apple
          apple.call();
          apple.message();
          System.out.println("Apple text: " + apple.text("Hello from Apple"));
    }
}

//to make abstract class, use abstract keyword before "class"
//if a class is abstract, it cannot be make object of
abstract class SmartPhone{
    //abstract function do not have a body
    //abstract class may or may not contain abstract function
    //if there is at least one abstract function, class have to be abstract
    
    abstract public void call();
    abstract public void message();
    abstract public boolean text(String text);
}

// To use abstract class it has to be extended into sub/child class
class Samsung extends SmartPhone{
    //When abstract class is extended
    //all the abstract function must be overriden/ implemented
    @Override
    public void call(){
        System.out.println("Samsung calling");
    }
    @Override
    public void message(){
        System.out.println("Samsung message");
    }
    @Override
    public boolean text (String text){
        return true;
    }
}

//Task create a class Apple that extends SmartPhone
//override the functions
//Make an object of Samsung and Apple
// and call all the function

class Apple extends SmartPhone {
    @Override
    public void call() {
        System.out.println("Apple calling");
    }
    @Override
    public void message() {
        System.out.println("Apple message");
    }
    @Override
    public boolean text(String text) {
        return true;
    }
}
