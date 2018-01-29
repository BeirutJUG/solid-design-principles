
package liskov_substitution.bad;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Swan implements Bird {
    public Swan() {
    }


    public void eat() {
        System.out.println("Swan eats grass");
    }

    public void fly() {
        System.out.println("Swan flying");
    }
}
