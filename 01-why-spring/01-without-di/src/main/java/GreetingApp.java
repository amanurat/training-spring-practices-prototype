/**
 * Created by Assanai Manurat on 5/6/2017 AD.
 */
public class GreetingApp {

    private GreetingEnglish greetingEnglish;
    private GreetingThai greetingThai;

    public GreetingApp() {
        greetingEnglish = new GreetingEnglish();
        greetingThai = new GreetingThai();
    }

    public void say() {
        greetingEnglish.say();
        greetingThai.say();
    }

    public static void main(String args[]) {

        GreetingApp greetingApp = new GreetingApp();
        greetingApp.say();

    }

}
