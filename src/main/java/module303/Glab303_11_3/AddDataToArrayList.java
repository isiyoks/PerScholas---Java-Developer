package module303.Glab303_11_3;

import java.util.ArrayList;
//we are passing Data to Book class by using the constructor,
// and by using the setter method.
public class AddDataToArrayList {
    public ArrayList<Book> bookdetails (){
        //User-defined class objects in Java ArrayList
        Book b1 = new  Book(1, "Death note", "John", "cartoon");
        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
        Book b4 = new Book(4, "GentleMen", "Max", "Action");
        Book b5 = new Book();
        b5.setNumber(5);
        b5.setName("Java FullStack");
        b5.setAuthor("Flex");
        b5.setCategory("Programming");

        ArrayList <Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        return list;

    }

}
