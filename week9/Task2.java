public class Task2 {
    public static void main(String[] args) {
        HalfPant halfPant = new HalfPant();
        halfPant.display(); // Display initial attributes

        halfPant.changePant("Blue");
        halfPant.display(); // Display attributes after color change
        
        
    }
    
}

// Make a class Pant
// Make 2 attribute, texture and color
// Make a class HalfPant that extends Pant
// Make 1 attribute color
// Make a Construtor of Pant that takes texture and color
// Make a Non-Param Constructor for Half pant, and call 
// Parent Parameterized Constructor, "Wool" and "Red"
// Make a function in HalfPant called changePant
// Takes color as params, and set the current color of Pant to HalfPant
// And change the  new color to HalfPant 


class Pant {
    String texture;
    String color;

    // Parameterized constructor for Pant
    public Pant(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }
}

class HalfPant extends Pant {
    String color;

    // Non-parameterized constructor for HalfPant
    public HalfPant() {
        super("Wool", "Red"); // Calling parent parameterized constructor
        this.color = "Red"; // Initializing color attribute of HalfPant
    }

    // Method to change the color of the HalfPant and parent Pant
    public void changePant(String newColor) {
        super.color = newColor; // Changing the color of parent Pant
        this.color = newColor; // Changing the color of HalfPant
    }

    // For testing purposes, you can add a method to display the attributes
    public void display() {
        System.out.println("Texture: " + texture + ", Parent Color: " + super.color + ", HalfPant Color: " + color);
    }
}
