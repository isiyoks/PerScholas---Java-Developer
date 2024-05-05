package module303.Glab303_11_1;

public class MyRunner {
    public static void main(String[] args) {
        //initialize the class with integer data
        DemoClass demoClass = new DemoClass();
        demoClass.genericsMethod(10);
        demoClass.genericsMethod("Per Scholas");
        demoClass.genericsMethod(340.5);
        demoClass.genericsMethod('S');

        System.out.println("-------------------");
        GMultipleDatatype <String, Integer>gMultipleDatatype = new GMultipleDatatype("Per Scholas", 3397);
        System.out.println("gMultipleDatatype.getValueOne() = " + gMultipleDatatype.getValueOne());
        System.out.println("gMultipleDatatype.getValueTwo() = " + gMultipleDatatype.getValueTwo());

    GMultipleDatatype<String, String> gMultipleDatatype2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println("gMultipleDatatype2.getValueOne() = " + gMultipleDatatype2.getValueOne());
        System.out.println("gMultipleDatatype2.getValueTwo() = " + gMultipleDatatype2.getValueTwo());

    }
}
