/*
Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution as comments in the source file.
 */

public class Assignment2 {
    private boolean[] alphabets;

    public Assignment2() {
        alphabets = new boolean[26];
    }

    public boolean checkAlphabets (String input) {
        for (int i = 0; i < input.length(); i++){
            input = input.toLowerCase();
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (alphabets[ch - 'a'] == false){
                    alphabets[ch - 'a'] = true;
                }
            }
        }
        for (boolean i : alphabets){
            if (i == false){
                return false;
            }
        }
        return true;
    }

    // Time complexity is O(n) for the above algorithm
    // whereas space complexity is O(1)

    public static void main (String[] args) {
        Assignment2 a2 = new Assignment2();
        boolean check = a2.checkAlphabets("Farmer jack realized that big yellow quilts were expensive");
        String result = check == true ? "contains" : "doesn't contain";
        System.out.println("Input string "+result+" all the letters of the alphabet.");
    }
}
