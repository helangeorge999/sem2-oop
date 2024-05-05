public class StaticFunction {
   /*in the following public and static is optional */
   public static int addTwoNumber(int a,int b){
    int sum=a+b;
    return sum;
}
public static boolean checkEven(int a) {
   boolean check =a%2==0;
   return check;
   
}
public static String vendingMachine(int menu){
if(menu==1){
    return"coke";
}
if(menu==2){
    return "water";
}
if(menu==3)
{
    return"frooti";
}
return "notthing";
}
public static String CheckAge(int a, String name){
if (a<18){
  return ("sorry "+name+" you are not eligible");
}
else{
    return( "cogratulation "+name+" you are eligible");

}
}
public static double makeMulitiply(double num1, double num2){
return num1*num2;
}


public static void main(String[] args) {
    // IF a function is static no need to make object
    // If the fucntion is static in same class you can simple call the method
    int sumReturn=addTwoNumber(10,30);
    System.out.println("The sum is"+ sumReturn);

    String frooti=vendingMachine(3);
    System.out.println("you have order "+frooti);
    /*task make a function checkEven
    that takes one int
    that returns a boolean
    if  the int is even or odd*/
   
    boolean even= checkEven(3);
        System.out.println("even number "+even);
        /*task 2
         * make a function checkEligible
         * that taske one int aagee, one string
         * if the age is<18
         * return string "sorry name, you are not elgible"
         * else retunr"congratulation name. you rare eligible
          */

        String age= CheckAge(18,"Miraj");
        System.out.println(""+ age);
         /* taks 3
         * make a function makeMuLTIPLY
         *THAT TAKE 2 double
         reutn a double with the multiplcaion of 2
         */
    double multiplcaion= makeMulitiply(21, 2);
        System.out.println("" +multiplcaion);
}
}
