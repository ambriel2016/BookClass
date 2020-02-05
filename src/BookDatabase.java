public class BookDatabase {
    private String SKU;
    private String title;
    private String author;
    private String description;
    private double price;
    private Book book;

    public BookDatabase(){

    }
    public BookDatabase(String SKU, String title, String author, String description, double price) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }
    public String getSKU(){
        return this.SKU;
    }
    public void setSKU(String SKU){
        this.SKU = SKU;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double price(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Book getBook(){
        return this.book;
    }
    public void setBook(Book book){
        this.book = book;
    }
}
