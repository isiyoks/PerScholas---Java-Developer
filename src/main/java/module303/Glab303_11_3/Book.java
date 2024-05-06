package module303.Glab303_11_3;

public class Book {
    private int number;
    private String name;
    private String author;
    private  String category;

    // Constructor with arguments
    public Book (){
    }
    public Book(int number, String name, String author, String category){
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }

}
