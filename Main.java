import java.util.ArrayList;

// THIS CODE OF STACK TO IMPLEMENT BY SCREECH
public class Main {
   static class stack{
       static ArrayList<Integer> list = new ArrayList<>();

       public static boolean  isEmpty() {
return list.size() == 0;
       }
       public static void push (int data){
           list.add(data);
       }
       public  static int pop(){
           int top = list.size()-1;
           list.remove(list.size()-1);
           return top;
       }
       public static int peek(){
           return list.get(list.size()-1);
       }
   }
    public static void main(String[] args) {
      stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println();
        while(!s.isEmpty()){

            System.out.println(s.peek());
            s.pop();
        }
    }
}