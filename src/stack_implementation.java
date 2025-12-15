import java.util.*;
public class stack_implementation {	
//	class StackCustom {
//	    int top;
//	    int size;
//	    int[] stack;
//
//	    // Constructor
//	    StackCustom(int size) {
//	        this.size = size;
//	        stack = new int[size];
//	        top = -1;
//	    }
//
//	    // Push operation
//	    void push(int data) {
//	        if (top == size - 1) {
//	            System.out.println("Stack Overflow");
//	            return;
//	        }
//	        stack[++top] = data;
//	    }
//
//	    // Pop operation
//	    int pop() {
//	        if (top == -1) {
//	            System.out.println("Stack Underflow");
//	            return -1;
//	        }
//	        return stack[top--];
//	    }
//
//	    // Peek operation
//	    int peek() {
//	        if (top == -1) {
//	            System.out.println("Stack is empty");
//	            return -1;
//	        }
//	        return stack[top];
//	    }
//
//	    // Check empty
//	    boolean isEmpty() {
//	        return top == -1;
//	    }
//
//	    // Display stack
//	    void display() {
//	        if (top == -1) {
//	            System.out.println("Stack is empty");
//	            return;
//	        }
//	        for (int i = top; i >= 0; i--) {
//	            System.out.println(stack[i]);
//	        }
//	    }
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(9);
        stk.push(5);
        stk.pop();
       System.out.println( stk.isEmpty());
	}

}
