package module303.PA303_10_3.PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test Case #1: KidUser
        KidUser kidUser1 = new KidUser(10, "Kids");
        KidUser kidUser2 = new KidUser(18, "Fiction");

        System.out.println("Test Case #1: KidUser");
        kidUser1.registerAccount();
        kidUser1.requestBook();

        System.out.println(" -------------------------------- ");

        kidUser2.registerAccount();
        kidUser2.requestBook();

        System.out.println(" -------------------------------- ");
        // Test Case #2: AdultUser
        AdultUser adultUser1 = new AdultUser(5, "Kids");
        AdultUser adultUser2 = new AdultUser(23, "Fiction");

        System.out.println("\nTest Case #2: AdultUser");
        adultUser1.registerAccount();
        adultUser1.requestBook();

        System.out.println(" -------------------------------- ");

        adultUser2.registerAccount();
        adultUser2.requestBook();

    }
}
