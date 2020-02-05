public class Book {
    private String bookTitle;
    private String author;
    private String description;
    private String price;
    boolean isInStock;

    public Book(){

    }
    public Book(String bookTitle, String author, String description, String price, boolean isInStock){
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
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
    public String getPrice(){
        return this.price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public boolean getIsInStock(){
        return this.isInStock;
    }
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public String getDisplayText(){
        return this.author + " " + this.bookTitle + " " + this.description;
    }
}
