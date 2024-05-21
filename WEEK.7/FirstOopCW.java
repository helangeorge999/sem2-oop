public class FirstOopCW {
    public static void main(String[] args) {
        
        Car car1 = new Car();
        car1.name = "Tesla ";
        car1.colour = "White ";
        car1.year = 2008;

        car1.start();
        car1.stop();

        Car car2 = new Car();
        car2.name = "Toyota ";
        car2.colour = "Black ";
        car2.year = 1933;

        car2.start();
        car2.expiry();

        Car car3 = new Car();
        car3.name = "BMW ";
        car3.colour = "Red";
        car3.year = 1928;

        car3.start();
        car3.expiry();

        System.out.println("Expiry year of " + car2.name + ": " + car2.expiry());
        System.out.println("Expiry year of " + car3.name + ": " + car3.expiry());
    }

    }

// Create a class car
// attribute
// - name
// - colour
// - year
// function
// - start()=> print car name is starting
// - stop()=> print Car name of colour is stopping
// - expiry() => return 100 added to year
// Create 3 object of car
//start all object/cars
//stop only 1st object/car
//print the expiry of last 2 object/car


class Car{
    String name;
    String colour;
    int year;

    void start(){
        System.out.println(name + "is starting");
    }

    void stop(){
        System.out.println(name + " of colour " + colour + " is stopping. ");
    }

    int expiry(){
        return year + 100;
    }  

}