import java.util.Set;
/**
 *A vampire number v is a number with an even number of digits n,
 * that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes,
 * where v contains precisely all the digits from x and from y, in any order.
 * Write a java program to print first 100 vampire numbers
 */
public class Vampire {
    /**
     * Finds the first 100 vampire numbers from all the permutations of each number.
     */
    public void findVampire () {
        int counter = 1;
        for (int i = 1000; counter<101; i++){
            String number = String.valueOf(i);
            if (number.length() == 4){
                Set<String> perms = Permutations.permutationFinder(number);
                for (String perm : perms) {
                    String fang1 = perm.substring(0, 2);
                    String fang2 = perm.substring(2, 4);

                    if (Integer.parseInt(number) == Integer.parseInt(fang1) * Integer.parseInt(fang2)) {
                        if (fang1.charAt(fang1.length()-1) == '0' && fang2.charAt(fang2.length()-1) == '0'){
                            continue;
                        }
                        System.out.println(counter+") "+number + " = " + fang1 + " * " + fang2);
                        counter++;
                        break;
                    }
                }
            }
            else if (number.length() == 6){
                Set<String> perms = Permutations.permutationFinder(number);
                for (String perm : perms) {
                    String fang1 = perm.substring(0, 3);
                    String fang2 = perm.substring(3, 6);

                    if (Integer.parseInt(number) == Integer.parseInt(fang1) * Integer.parseInt(fang2)) {
                        if (fang1.charAt(fang1.length()-1) == '0' && fang2.charAt(fang2.length()-1) == '0'){
                            continue;
                        }
                        System.out.println(counter+") "+number + " = " + fang1 + " * " + fang2);
                        counter++;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Vampire vam = new Vampire();
        vam.findVampire();
    }
}
