import Stacks.LinkedStack;
import Stacks.Stack;

public class LinkedStackDemo {
    public static boolean isMatched(String expression){
        final String opening = "({[";
        final String closing = ")}]";
        Stack<Character> buffer = new LinkedStack<>();
        for(char c: expression.toCharArray()){
            if(opening.indexOf(c) != -1){
                buffer.push(c);
            } else if(closing.indexOf(c) != -1){
                if(buffer.isEmpty()){
                    return false;
                }
                if(closing.indexOf(c) != opening.indexOf(buffer.pop())){
                    return false;
                }
            }
        }
        return buffer.isEmpty();
    }

    public static boolean isHTMLMatched(String html){
        Stack<String> buffer = new LinkedStack<>();
        int j = html.indexOf('<');
        while (j != -1) {
            int k = html.indexOf('>', j + 1);
            if(k == -1) return false;

            String tag = html.substring(j + 1, k);
            if(!tag.startsWith("/")){
                buffer.push(tag);
            } else {
                if(buffer.isEmpty()) return false;
                if(tag.substring(1) != buffer.pop()){
                    return false;
                }
            }
            j = html.indexOf('<', k + 1);   
        }
        return buffer.isEmpty();
    }
}
