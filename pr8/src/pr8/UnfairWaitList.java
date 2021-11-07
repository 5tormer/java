package pr8;

public class UnfairWaitList <E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        boolean removed = false;
        for (int i = 0; i < queue.size(); i++) {
            E el = queue.remove();
            if (!removed && el.equals(element))
                removed = true;
            else
                queue.add(el);
        }
        if (removed)
            queue.add(queue.remove());
    }

    public void moveToBack(E element)
    {
        int prevSize = queue.size();
        remove(element);
        if (queue.size() < prevSize)
            queue.add(element);
    }
}