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
