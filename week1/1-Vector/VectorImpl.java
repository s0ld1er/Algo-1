import java.util.Arrays;
import java.util.NoSuchElementException;

public class VectorImpl implements Vector {
    private final int INITIAL_CAPACITY = 8;
    private int[] vectorArr = new int[INITIAL_CAPACITY];
    private int sizeLeft = INITIAL_CAPACITY;
    private int curIndex = 0;

    private void resize() {
        sizeLeft = capacity();
        vectorArr = Arrays.copyOf(vectorArr, capacity() * 2);
    }

    @Override
    public void insert(int index, int value) {
        if (sizeLeft > 0) {
            System.arraycopy(vectorArr, index, vectorArr, index + 1, size());
            vectorArr[index] = value;
            curIndex++;
            sizeLeft--;

        } else {
            resize();
            insert(index, value);
        }
    }

    @Override
    public void add(int value) {
        if (sizeLeft > 0) {
            vectorArr[curIndex] = value;
            curIndex++;
            sizeLeft--;
        } else {
            resize();
            add(value);
        }
    }

    @Override
    public int remove(int index) {
        if (index > curIndex) {
            throw new NoSuchElementException();
        } else {
            int removedElement = vectorArr[index];
            sizeLeft++;
            curIndex--;
            System.arraycopy(vectorArr, index + 1, vectorArr, index, size());
            return removedElement;
        }

    }

    @Override
    public int get(int index) {
        if (index < curIndex) {
            return vectorArr[index];
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size() {
        return capacity() - sizeLeft;
    }

    @Override
    public int capacity() {
        return vectorArr.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size(); i++) {
            sb.append(vectorArr[i] + ", ");
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        sb.append(']');
        return sb.toString();
    }

}
