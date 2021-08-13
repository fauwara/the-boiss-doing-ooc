// Write a java program to create a class Fruits with members fruitname and qty.
// Write the zero parameter and paramerized constructors to create the fruits objects
// with fruits information. Create methods Addfruits and Usefruits to add and use
// the fruits from the existing quantity. Throw a user defined exception
// "NotEnoughFruits" with the message "You have only xx number of fruits" when
// quantity of used fruits less than existing quantity. Create and throw a user defined
// exception "BoxFullException" when the total quantity of fruits is more than 100
// with the message "Box is almost full. You can add only xx fruits". The Program
// should also throw an exception "Lowstock" when the quantity becomes zero.
// Demonstrate the use of throws clause.
// Note : xx is the quantity of fruits

// exception
class InvalidFruitCount extends Exception{  
    public InvalidFruitCount (String str){    
        super(str);
    }  
}  

class Fruits {
    String fruitName;
    int fruitQty;

    Fruits() {
        System.out.println("Fruit object created with out params");
    }

    Fruits(String name, int qty) {
        fruitName = name;
        fruitQty = qty;
        System.out.println(qty + " " + fruitName + " object created ");
    }

    void add(int qty){

        try{
            
            if(fruitQty + qty > 100){
                throw new InvalidFruitCount("Box is almost full. You can add only " + (100 - fruitQty) + " fruits");
            }

            fruitQty += qty;
            System.out.println("Added " + qty + " more " + fruitName + ".\nTotal: " + fruitQty );
        }
        catch (InvalidFruitCount ex)
        {
            // System.out.println("Caught");
            System.out.println(ex.getMessage());
        }

    }

    void use(int qty){
        
        try{
            
            if(fruitQty - qty < 0){
                throw new InvalidFruitCount("You only have " + fruitQty + " number of fruits");
            }

            fruitQty -= qty;
            System.out.println("used " + qty + " " + fruitName + ".\nTotal: " + fruitQty );
            if (fruitQty == 0){
                System.out.println("Lowstock");
            }
        }
        catch (InvalidFruitCount ex)
        {
            // System.out.println("Caught");
            System.out.println(ex.getMessage());
        }

    }

}

public class index {
    public static void main(String[] args){
        Fruits fruits1 = new Fruits("orange", 25); 
        Fruits fruits2 = new Fruits();

        fruits1.add(30);
        fruits1.add(100);
        fruits1.use(5);
        fruits1.use(70);
        fruits1.use(50);
    }
}
