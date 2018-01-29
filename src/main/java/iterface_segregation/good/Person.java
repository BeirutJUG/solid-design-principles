
package iterface_segregation.good;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Person implements IWorkable, IFeedable {
    public Person() {
    }


    public void work() {
        //WORKING
    }

    public void eat() {
        //EATING
    }
}
