public class Task {
    public static void main(String[] args) {
        Dog GermanShepard = new Dog();
        GermanShepard.legs = 4;
        GermanShepard.diet = "meat";
        GermanShepard.lifespan = 12;
        GermanShepard.speak();
        GermanShepard.barks();
        GermanShepard.fur();
    }
}
class Animal{
    int lifespan;
    void speak(){
        System.out.println("Animal Speaks");
    }
}

class mammal extends Animal{
    int legs;
    void fur(){
        System.out.println(legs + " furry");
    }
}

class Dog extends mammal{
    String diet;
    void barks(){
        System.out.println("Dog barks");
    }
}

class GermanShepard extends Dog{

}

class Labradog extends Dog{

}

class reptile extends Animal{
    int eggs;
    void shed(){
        System.out.println("Shedding");
    }
}

