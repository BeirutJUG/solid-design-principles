
package single_responsibility.good;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class BookSearch {
    private Book book;


    public BookSearch(Book book) {
        this.book = book;
    }


    public int findPage(String word) {
        int wordIndexPage = 0;
        for (String page : book.getPageContent()) {
            wordIndexPage++;
            if (page.contains(word)) {
                return wordIndexPage;
            }
        }
        return wordIndexPage;
    }
}
