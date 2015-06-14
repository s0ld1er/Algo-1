
public interface Queue {

    // Adds value to the end of the Queue.
    // Complexity: O(1)
    public void push(Object value);

    // Returns value from the front of the Queue and removes it.
    // Complexity: O(1)
    public Object pop();

    // Returns value from the front of the Queue without removing it.
    // Complexity: O(1)
    public Object peek();

    // Returns the number of elements in the Queue.
    // Complexity: O(1)
    public int size();

}
