package assignment1;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class StringHandler {

    public String stringManipulation(String str) {
        return str.replaceAll("c","s");
    }

    public int stringLength(String str) {
        if (str != null && !str.trim().isEmpty()){
            return str.length();
        }
        else {
            return 0;
        }
    }

    public int stringArrayLength(String[] arr) {
        int result = 0;
        for (String str: arr) {
             result = result + str.length()  ;
        };
        return result;
    }

    public String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public int charCount(String str, char c) {

        return (int)str.chars().filter(ch -> ch == toLowerCase(c) || ch == toUpperCase(c)).count();
    }

    public String stringOfChars(int amount, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++){
            sb.insert(i, c);
        }
        return sb.toString();
    }


}
