import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take input from user
        String s=sc.next();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);

            }
            else if(st.isEmpty()){
                System.out.println(false);
                return;
            }
            else if(ch==')' && st.pop()!='('){
                System.out.println(false);
                return;
            }
            else if(ch=='}' && st.pop()!='{'){
                System.out.println(false);
                return;
            }
            else if(ch==']' && st.pop()!='['){
                System.out.println(false);
                return;
            }
           


        }
        // if stack is empty return true becuase then parentheses is valid , else false
        System.out.println(st.isEmpty());

    }
    
}
