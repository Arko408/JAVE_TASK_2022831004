package practice_problem_06;

public class books
{
    int bookId;
    String bookName;
    String bookAuthor;
    String yearPub;
    float price;
    String status;

    void addNewBooks(String book)
    {
        System.out.println("new book added");
    }

    void deleteBooks(String book)
    {
        System.out.println("book deleted");
    }

    void displayBookDetails(String book)
    {
        System.out.println("book displayed");
    }

    void inquiryBook(String book)
    {
        System.out.println("book inquired");
    }
    public static void main(String[] args)
    {
        books a=new books();

    }
}
