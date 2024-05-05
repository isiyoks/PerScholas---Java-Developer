package ForPractice;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass <String> str = new GenericClass<>();
        str.setT("Serra");
        System.out.println("str.getT() = " + str.getT());

        GenericClass <Integer> num = new GenericClass<>();
        num.setT(35);
        System.out.println("num.getT() = " + num.getT());

        GenericClass.staticMethod(345);
        GenericClass.staticMethod("Generic Static method");

        GenericClass arr = new GenericClass();
        GenericClass <Integer> arr1 = new GenericClass();
        Integer [] arrayInt = {1,2,3,4,5};
        Character [] arrayChar = {'j','a','v','a'};

        System.out.println("<Integer> included when object was created!");
        arr1.printRegularArray(arrayInt);

        arr.printArray(arrayInt);
        arr.printArray(arrayChar);

        GenericClass arr2 = new GenericClass();
        arr2.printRegularArray(arrayInt);

    }
}
