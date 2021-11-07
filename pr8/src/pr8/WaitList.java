package pr8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> queue;
    public WaitList()
    {
        queue = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> collection)
    {
        queue = new ConcurrentLinkedQueue<>(collection);
    }

    public String toString()
    {
        return "WaitList{" + "components=" + queue + '}';
    }

    public void add(E element)
    {
        queue.add(element);
    }

    public E remove()
    {
        if(isEmpty()) throw new IllegalStateException("Очередь пуста!");
        return queue.remove();
    }

    public boolean contains(E element) {
        boolean res = false;
        for(int i = 0; i < queue.size(); i++){
            E el = queue.remove();
            if(el.equals(element)) res = true;
            queue.add(el);
        }
        return res;
    }

    public boolean containsAll(Collection<E> collection) {
        ArrayList<E> al = new ArrayList<>(collection);
        for(int i = 0; i < collection.size(); i++){
            boolean res = false;
            for(int j = 0; j < queue.size(); j++){
                E el = queue.remove();
                if(el.equals(al.get(i))) res = true;
                queue.add(el);
            }
            if(!res) return false;
        }
        return true;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
