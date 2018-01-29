
package iterface_segregation.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Robot implements IWorker {
    public Robot() {
    }


    public void work() {
        //working
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }
}
