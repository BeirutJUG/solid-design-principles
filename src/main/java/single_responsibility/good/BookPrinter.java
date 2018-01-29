
package single_responsibility.good;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class BookPrinter {
    private Book book;


    public BookPrinter(Book book) {
        this.book = book;
    }


    public void printCurrentPage() {
        String currentPageContent = book.getPageContent().get(book.getCurrentPage());
        System.out.println(currentPageContent);
    }

    public void printBook() {
        for (String page : book.getPageContent()) {
            System.out.println(page);
        }
    }

}
