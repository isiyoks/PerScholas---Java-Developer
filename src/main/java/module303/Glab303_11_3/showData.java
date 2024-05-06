package module303.Glab303_11_3;

import java.util.ArrayList;

public class showData {
    public static void main(String[] args) {

        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList <Book> bookList = b.bookdetails();
        for (Book eachBook:bookList) {
            // ---- invoking getter method for geting Data---------
            System.out.println(eachBook.getNumber()+" "+ eachBook.getName()+" "
                    + eachBook.getCategory()+" "+ eachBook.getAuthor());
        }
    }
}
