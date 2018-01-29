
package liskov_substitution.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Penguin implements Bird {
    public Penguin() {
    }


    public void eat() {
        System.out.println("Penguin eats fish");
    }

    public void fly() {
        throw new UnsupportedOperationException();
    }
}
