import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        String string = "Able was I ere I saw Elba";
        String[] arrList = string.toUpperCase().split("");
        for (String e: arrList){
            stack.push(e);
            queue.add(e);
        }
        boolean check = true;
        for (int i = 0; i < arrList.length; i++){
            String lastStack = stack.pop();
            String firstQueue = queue.remove();
            if (!lastStack.equals(firstQueue)){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Là chuỗi palindrome");
        } else {
            System.out.println("Không phải chuỗi palindrome");
        }

    }
}
