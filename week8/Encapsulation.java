public class Encapsulation{
    public static void main(String[] args) {
        //for name
        Laptop laptop1 = new Laptop();
        laptop1.setName("Nitro V 15");
        System.out.println(laptop1.getName());

        //for brand
        Laptop laptop2 = new Laptop();
        laptop2.setBrand("ACER");
        System.out.println(laptop2.getBrand());

        //for price 
        Laptop laptop3 = new Laptop();
        laptop3.setPrice(113200);
        System.out.println(laptop3.getPrice());

        //for year
        Laptop laptop4 = new Laptop();
        laptop4.setYear(2024);
        System.out.println(laptop4.getYear());

    }
}
// bundle similar properties and function into class
class Laptop{
    // data hiding can be done using private access modifier
    private String name;
    private String brand;
    private double price;
    private int year;
    // make read-only access using getter
    public String getName(){
        return this.name;
    }
    // make write-only access using setter
    public void setName(String name){
        this.name = name;
    }
    //Task
    //Name getter and setter for all attributes
    //Make 2 object of laptop
    //Output:
    //name: Apple M1
    //Brand: Apple
    //Price: 100000
    //Year: 2023
    


    //for brand
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    
    
    //for price
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }



    //for year
    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }



}