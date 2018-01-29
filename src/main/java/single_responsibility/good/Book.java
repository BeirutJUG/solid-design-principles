
package single_responsibility.good;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by felkhodari on 1/18/2018.
 */
public class Book {
    private String title;
    private String author;
    private int currentPage;
    private List<String> pageContent; //index is page number


    public Book() {
        this.currentPage = 1;
        pageContent = new ArrayList<String>();
    }


    public List<String> getPageContent() {
        return pageContent;
    }

    public void setPageContent(List<String> pageContent) {
        this.pageContent = pageContent;
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
        currentPage++;
    }

    public int getCurrentPage() {
        return currentPage;
    }

}
