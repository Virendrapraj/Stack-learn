// THIS CODE IS IMPLEMENT BY JAVA COLLECTION FRAMEWORK

import java.util.*;
public class jcfstsck {
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<Integer>();
        for(int i= 0;i<=5;i++) {
            s.push(i);
        }
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
