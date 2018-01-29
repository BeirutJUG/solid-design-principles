
package single_responsibility.bad;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by felkhodari on 1/18/2018.
 */
public class Book {
    private String title;
    private String author;
    private int pageTurn;
    private List<String> pageContent; //index is page number


    public Book() {
        this.pageTurn = 1;
        pageContent = new ArrayList<String>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void turnPage() {
        pageTurn++;
    }

    public int getCurrentPage() {
        return pageTurn;
    }

    public void printCurrentPage() {
        String currentPageContent = pageContent.get(getCurrentPage());
        System.out.println(currentPageContent);
    }

    public void printBook() {
        for (String page : pageContent) {
            System.out.println(page);
        }
    }

    public int findPage(String word) {
        int wordIndexPage = 0;
        for (String page : pageContent) {
            wordIndexPage++;
            if (page.contains(word)) {
                return wordIndexPage;
            }
        }
        return wordIndexPage;
    }

}
