package AdvancedTask;

public class TestIsSubstring {
    public static boolean isSubString(String substr, String str) {
        boolean rc = false;
        String word;

        for(int i = 0; i < str.length(); i ++) {
            word = new String();

            for(int j = i; j < str.length(); j ++) {
                word += str.charAt(j);

                //System.out.println("current word is " + word);
                if(substr.compareTo(word) == 0) {
                    rc = true;
                    return rc;
                }
            }
        }

        return rc;
    }

    public static void main(String[] args) {
        System.out.println(isSubString("The", "The cat in the hat."));
        System.out.println(isSubString("hat.", "The cat in the hat."));
        System.out.println(isSubString("oops", "The cat in the hat."));
        System.out.println(isSubString("cat", "The cat in the hat."));
    }
}