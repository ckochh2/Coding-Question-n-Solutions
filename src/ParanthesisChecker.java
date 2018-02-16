
import java.util.*;
import java.lang.*;
import java.io.*;

class ParanthesisChecker
{
    static class Stack
    {
        int top =-1;
        char items[] = new char[100];

        void push(char ch)
        {
            if(top==99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top]=ch;
            }
        }

        char pop(){
            if(top == -1)
            {
                System.out.println("Stack is empty");
                return '\0';
            }
            else
            {
                char returnTop = items[top];
                top--;
                return returnTop;
            }
        }

        boolean isEmpty(){
            if(top ==-1)
                return true;
            else
                return false;
        }


    }

    static boolean checkClosingParanthesis(char item1,char item2){
        if(item1=='(' && item2 ==')')
            return true;
        if(item1=='{' && item2 =='}')
            return true;
        if(item1=='[' && item2 ==']')
            return true;
        else
            return false;

    }

    static boolean paranthesisChecker(String s)
    {
        char c[] = s.toCharArray();
        Stack stack = new Stack();
        for(int i=0;i<c.length;i++) {
            if ( c[i] == '(' || c[i] == '{' || c[i] == '[' )
                stack.push(c[i]);

            if ( c[i] == ')' || c[i] == '}' || c[i] == ']' ) {
                if ( stack.isEmpty() )
                    return false;

                else if ( !checkClosingParanthesis(stack.pop(), c[i]) ) {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
            return false;
    }



    public static void main (String[] args)
    {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            String s = in.next();
            boolean b = paranthesisChecker(s);
            if(b==true)
                System.out.println("Balanced");
            else
                System.out.println("Unbalanced");
        }
    }
}