public class InterfaceClass {
    public static void main(String[] args) {
        
    }
}

//make interface similar to class with "interface" keyword
//interface is automatically abstract
interface AnimalInterface{
    //function inside the interface is automatically absttract
    //function hidden or no body
    public void eat();
    public void sleep();
}
//interface can extend interface
interface MammalInterface extends AnimalInterface{
    public int legs();
}

// can nest on multi level
interface DogInterface extends MammalInterface{
    public String barks();
}
interface DomesticInterface{
    public void pet();
}
class Husky implements DogInterface, DomesticInterface{
    // if the interface is built/extended on top another interface
    //all the function on top of the interface should be overriden
    @Override
    public void pet(){
        System.out.println("Husky likes pet");
    }
    @Override
    public void eat(){
        System.out.println("Husky eats fish");
    }
    @Override
    public void sleep(){
        System.out.println("Husky sleeps at dusk");
    }
    @Override
    public int legs(){
        return 4;
    }
    @Override
    public String barks(){
        return "Woof woof!";
    }
}
// to use interface use "implements" keyword
class Bulldog implements AnimalInterface{
    //using interface, we need to override/make body of all the function of interface
    @Override
    public void eat(){
        System.out.println("Bulldog eats Meat");
    }
    @Override
    public void sleep(){
        System.out.println("Bulldog sleeps at night");
    }
}
class Cow implements AnimalInterface{
    @Override
    public void eat(){
        System.out.println("Cow eats Grass");
    }
    @Override
    public void sleep(){
        System.out.println("Cow sleeps at Morning");
    }
}
