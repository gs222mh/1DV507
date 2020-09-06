package GS222MH_assign1.Stack;

public interface StringStack {
    int size(); 			// Current stack size
    boolean isEmpty(); 		// true if stack is empty
    void push(String element); 	// Add element at top of stack
    String pop() throws IllegalAccessException; 		// Return and remove top element,
                        // exception if stack is empty
    String peek() throws IllegalAccessException; 		// Return (without removing) top element,
                          // exception if stack is empty.
}
