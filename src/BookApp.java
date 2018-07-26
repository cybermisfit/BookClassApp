//Create another class called BookApp which contains the main method. In the main method you shall create an instance of
//a Book and print the Author, Title and Description.

public class BookApp {

    public static void main(String[] args){
        Book book1 = new Book();
        book1.setTitle("Author One's Title");
        book1.setAuthor("Author One");
        book1.setDescription("Author One's book is about the...");

        System.out.print(book1.getDisplayText());


    }
}
