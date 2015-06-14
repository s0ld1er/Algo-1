
public interface Stack {
    // Adds value to the end of the Stack.
    // Complexity: O(1)
    public void push(Object value);

    // Returns value from the end of the Stack and removes it.
    // Complexity: O(1)
    public void pop();

    // Returns value from the end of the Stack without removing it.
    // Complexity: O(1)
    public Object peek();

    // Returns the number of elements in the Stack.
    // Complexity: O(1)
    public int size();

}
