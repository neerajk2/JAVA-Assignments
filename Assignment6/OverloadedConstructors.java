/**
 * Create a class with two (overloaded) constructors.
 * Using this, call the second constructor inside the first one.
 */

public class OverloadedConstructors {
    private String text;

    public OverloadedConstructors() {
        this("Second");
        text = "First";
        System.out.println(text);
    }

    public OverloadedConstructors(String s) {
        this.text = s;
        System.out.println(text);
    }

    public static void main(String[] args) {
        OverloadedConstructors oc = new OverloadedConstructors();
    }
}
