package module303.Glab303_11_2;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        List <Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println("firstTenPrimeNumbers before adding next five= " + firstTenPrimeNumbers);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println("firstTenPrimeNumbers after adding next five= " + firstTenPrimeNumbers);


    }
}
