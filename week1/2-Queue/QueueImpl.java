public class QueueImpl implements Queue {
    private MyLinkedList queue = new MyLinkedList();

    @Override
    public void push(Object value) {
        queue.add(value);
    }

    @Override
    public Object pop() {
        return queue.remove();
    }

    @Override
    public Object peek() {
        return queue.getFirst();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(queue.get(i) + ", ");
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append(']');
        return sb.toString();
    }

}
