import java.util.regex.*;

public class Assignment9 {

    private String text;
    public Assignment9(String text)
    {
        this.text = text;
    }

    public boolean patternMatch(String pattern)
    {
        Pattern tokSplitter = Pattern.compile(pattern);
        Matcher m = tokSplitter.matcher(text);
        if (m.find()) {
            return true;
        }
        else
            return false;
    }

    public static void main(String args[])
    {
        Assignment9 a9 = new Assignment9("All hail Caesar.");

        boolean sentenceFound = a9.patternMatch("^[A-Z][a-z ]+[A-Z]*[a-z ]+.$");

        if(sentenceFound)
            System.out.println("The given sentence contains the first letter as capital letter " +
                    "and ends with a period.");
        else
            System.out.println("The given sentence either do not start with a capital letter " +
                    "or doesn't ends with a period.");
    }
}
