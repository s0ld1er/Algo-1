public class StackImpl implements Stack {
    private QueueImpl queue;

    public StackImpl() {
        queue = new QueueImpl();
    }

    @Override
    public void push(Object value) {
        queue.push(value);
    }

    @Override
    public void pop() {
        QueueImpl queue2 = new QueueImpl();
        for (int i = 0; i < queue.size(); i++) {
            queue2.push(queue.pop());
        }
        queue = queue2;

    }

    @Override
    public Object peek() {
        QueueImpl queue2 = queue;
        for (int i = 0; i < queue.size() - 1; i++) {
            queue2.pop();
        }
        Object last = queue2.pop();
        return last;
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
            Object curEl = queue.peek();
            sb.append(curEl + ", ");
            pop();
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append(']');
        return sb.toString();
    }

}
