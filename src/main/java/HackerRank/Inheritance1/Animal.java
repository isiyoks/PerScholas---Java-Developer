package HackerRank.Inheritance1;

public class Animal {
    void walk(){
        System.out.println("I am walking");
    }
    public static void displayAnimalSound(Animal animal){
        animal.walk();
    }
}
