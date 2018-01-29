
package open_closed.good;

/**
 * Created by felkhodari on 1/18/2018.
 */
public class Greeter {
    private Personality personality;

    public Greeter(Personality personality) {
        this.personality = personality;
    }

    public String greet() {
        return this.personality.greet();
    }
}
