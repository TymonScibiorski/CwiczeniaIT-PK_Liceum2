import javax.swing.*;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;
import java.lang.*;
import java.util.*;

public class  Main {
    public static void main(String[] args) {
        //Both stack and heap are linked lists

        //Stack is LIFO in java
        Stack<String> stos= new Stack<>();

        //Adding something to the stack
        stos.push("John");

        //Checking what's on top of the stack
        String imie = stos.peek();

        //Deleting from the top of the stack and returning the deleted item
        String imie2 = stos.pop();

        //Measuring the size of the stack
        int size = stos.size();


        //Heap is FIFO in java
        LinkedList<Integer> kolejka = new LinkedList<>();

        //enqueue/dequeue


        //testing functions
        System.out.println(Nawiasy("Alea ma (kota) i [psa] i {(cos)} tam jeszcze"));

        System.out.println(Nawiasy("(a((((())))))"));

        Stack<String> dupa = new Stack<>();
        dupa.push("a");
        dupa.push("b");
        dupa.push("c");
        System.out.println(Inversion(dupa));


    }

    public static boolean Nawiasy(String zdanie) {
        //stack we gon' use
        Stack<Character> stos = new Stack<>();

        //converts the text into an Array of Charts
        char[] znaki = zdanie.toCharArray();

        //fors through the chars
        for(char i : znaki) {

            //if there's an opening parenthesis it's added to the stack
            if("({[".indexOf(i) >= 0){
                stos.push(i);
            }

            //if there's somethin in there
            if (stos.size() > 0) {
                //and the closing parenthesis are found they're both substracked
                if (stos.peek() == '(' && i == ')') {
                    stos.pop();
                    break;
                }
                if (stos.peek() == '{' && i == '}') {
                    stos.pop();
                    break;
                }
                if (stos.peek() == '[' && i == ']') {
                    stos.pop();
                    break;
                }

            }

            //this if makes the program work if there are only closing periphrasis in the text
            if (stos.size() == 0 && ")}]".indexOf(i) >= 0) {
                return false;
            }

        }

        return stos.size() == 0;
    }

    //this method returns a stack with the same Strings in an inverted order of the provided one
    public static Stack<String> Inversion(Stack<String> entry) {
        Stack<String> output = new Stack<>();

        while (entry.size() > 0){
            output.push(entry.pop());
        }
        return output;
    }


    public static int ONP(Stack<String> entry) {
        //this stack will be a temporary storing space for calculations
        Stack<String> stos = new Stack<>();

        for (String i : entry) {
            stos.push(i);

            try {
                
            }

        }

    }


    // This function calculates the equation contained in the entry Stack.
    // It should be triggered when the function looping through the given ONP sees an operator.
    // It returns a stack containing the result, which allows continuing with calculating the given ONP Stack
    public static Stack<String> calculator(Stack<String> calculation) {
        // Extracting the integers and the operator
        int num1 = Integer.parseInt(calculation.pop());
        int num2 = Integer.parseInt(calculation.pop());
        char operator = calculation.pop().charAt(0);

        //Creating the stack containing 
        int out = 0;
        Stack<String> outStack = new Stack<>();

        if (operator == '+'){
            out = num1 + num2;
        }
        if (operator == '-'){
            out = num1 - num2;
        }
        if (operator == '/'){
            out = num1 / num2;
        }
        if (operator == '*'){
            out = num1 * num2;
        }

        outStack.push(Integer.toString(out));
        return outStack;
    }



}