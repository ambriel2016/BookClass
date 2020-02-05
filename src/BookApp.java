import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {

        String input = "";
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        System.out.println("Please enter the name of the Title of the Book: ");
        b.setBookTitle(sc.nextLine());
        System.out.println("Please enter the author of the Book: ");
        b.setAuthor(sc.nextLine());
        System.out.println("Please enter the description of the Book: ");
        b.setDescription(sc.nextLine());
        System.out.println("Please enter the price of the Book");
        b.setPrice(sc.nextLine());
        System.out.println("Is the Book in Stock (Y/N)");
        input = sc.nextLine();

        if (input.equals("Y")){
                b.setIsInStock(true);
        }else if (input.equals("N")){
                b.setIsInStock(false);
        }
        String finalString = "The book you were entered was: " + b.getBookTitle() + " by " + b.getAuthor() + " " + b.getDescription() + " " + b.getPrice();

        if (b.isInStock == true){
            finalString += "The book you entered is currently in stock";
        }
        System.out.println(finalString);
    }
}
