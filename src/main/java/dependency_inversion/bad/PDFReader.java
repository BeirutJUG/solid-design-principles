
package dependency_inversion.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class PDFReader {

    private PDFBook PDFBook;


    public PDFReader(PDFBook PDFBook) {
        this.PDFBook = PDFBook;
    }


    public void read() {
        PDFBook.read();
    }
}
