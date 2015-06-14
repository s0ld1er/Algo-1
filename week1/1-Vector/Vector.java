public interface Vector {

    // Adds value at a specific index in the Vector.
    // Complexity: O(1)
    public void insert(int index, int value);

    // Adds value to the end of the Vector.
    // Complexity: O(1)
    public void add(int value);

    // Removes element at the specific index
    // Complexity: O(n)
    public int remove(int index);

    // Returns value at a specific index in the Vector
    // Complexity: O(1)
    public int get(int index);

    // Returns the number of elements in the Vector.
    // Complexity: O(1)
    public int size();

    // Returns the total capacity of the Vector.
    // Complexity: O(1)
    public int capacity();
}
