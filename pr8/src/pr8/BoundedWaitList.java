package pr8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity)
    {
        super();
        if(capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }
    public BoundedWaitList(Collection<E> col)
    {
        super (col);
        this.capacity = col.size();
    }
    public int getCapacity()
    {
        return capacity;
    }
    public void add(E element)
    {
        if(queue.size() == capacity) throw new IllegalStateException("Очередь заполнена!");
        queue.add(element);
    }
    public String toString()
    {
        return "BoundedWaitList{" + "capacity=" + capacity + ", components=" + queue + '}';
    }
}
