/**
 * $Id: $
 * $Change: $
 *
 * Copyright Murex S.A.S., 2003-2018. All Rights Reserved.
 *
 * This software program is proprietary and confidential to Murex S.A.S and its
 * affiliates ("Murex") and, without limiting the generality of the foregoing
 * reservation of rights, shall not be accessed, used, reproduced or distributed
 * without the express prior written consent of Murex and subject to the
 * applicable Murex licensing terms.
 *
 * Any modification or removal of this copyright notice is expressly prohibited.
 */
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
