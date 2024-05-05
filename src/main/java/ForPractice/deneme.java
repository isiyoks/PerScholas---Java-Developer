package ForPractice;

public class deneme {
    public static void main(String[] args) {

        int number =123456;
        String str = Integer.toString(number);
        int result = 123456/100000;  //1
        int count=10000;

        for (int i = 0; i < str.length()-1; i++) {
            number = number%count;

        }


    }
}
