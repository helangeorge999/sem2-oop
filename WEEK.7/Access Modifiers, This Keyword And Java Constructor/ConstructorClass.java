public class ConstructorClass {
    public static void main(String[] args) {
      ConExample con1 = new ConExample();  
      System.out.println("after object creation");
      Con2Example con2 = new Con2Example(5);
      System.out.println(con2.length);
      FruitBasket FB = new FruitBasket(10,20 ,30 );
     
      System.out.println(FB.Total());
    }
}
class ConExample{
    ConExample(){
        System.out.println("this is non parameterized constructor");
    }
}
class Con2Example{
    int length;
    Con2Example(int length){
        this.length = length;
        System.out.println(this.length);
    }
}
 
class FruitBasket{
    private int appleCount;
    private int cherryCount;
    private int grapeCount;
    FruitBasket(int appleCount, int cherryCount,int grapeCount){
        this.appleCount = appleCount;
        this.cherryCount = cherryCount;
        this.grapeCount = grapeCount;
    }
    int Total(){
        return appleCount+cherryCount+grapeCount;
    }
   
}
 
 