
package dependency_inversion.good;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class EBookReader {
    private EBook book;


    public EBookReader(EBook book) {
        this.book = book;
    }


    private void read() {
        book.read();
    }
}
