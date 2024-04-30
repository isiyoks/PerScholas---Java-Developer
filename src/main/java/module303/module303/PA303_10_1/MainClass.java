package module303.module303.PA303_10_1;
/*
Scenario: In our game app, we have many types of monsters that can attack.
You will design a superclass called Monster and define the method of attack() in the superclass.
You will design subclasses called FireMonster, WaterMonster, and StoneMonster.
The subclasses will then provide their actual implementation.
In the main program, we will declare instances of the superclass,
substitute them with the actual subclass, and invoke the method defined in the superclass.
 */
public class MainClass {
    public static void main(String[] args) {
        // Declare instances of the superclass, substituted by subclasses
        Monster fireMonster = new FireMonster();
        Monster waterMonster = new WaterMonster();
        Monster stoneMonster = new StoneMonster();


        // Invoke the attack() method (polymorphism in action)
        System.out.println(fireMonster.attack());
        System.out.println(waterMonster.attack());
        System.out.println(stoneMonster.attack());


    }
}
