public class LinkedList<T>
{
    private class Node<T>
    {
        Node<T> next;
        T value;
        Node(T value)
        {
            this.value = value;
            this.next = null;
        }
    }
    private Node<T> head = null;
    public int size()
    {
        int size = 0;
        for (Node<T> p = head; p != null; p = p.next)
        {
            ++size;
        }
        return size;
    }
    public boolean isEmpty()
    {
        return this.size() == 0;
    }
    public boolean contains(T object)
    {
        if (isEmpty())
        {
            return false;
        }
        for (Node<T> p = head; p != null; p = p.next)
        {
            if (p.value.equals(object))
            {
                return true;
            }
        }
        return false;
    }
    public void add(T object)
    {
        if (isEmpty())
        {
            head = new Node<T>(object);
        } else {
            Node<T> p = head;
            Node<T> node = new Node<T>(object);
            while (p.next != null)
            {
                p = p.next;
            }
            p.next = node;
            node.next = null;
        }
    }
    public boolean remove(T object)
    {
        Node<T> p = head;
        Node<T> p1 = null;
        boolean have = false;
        if (isEmpty()) {
            return false;
        }
        while (p != null)
        {
            if (p.value.equals(object))
            {
                if (p1 == null)
                {
                    head = head.next;
                } else
                {
                    p1.next = p.next;
                }
                have = true;
            }
            p1 = p;
            p = p.next;
        }
        return have;
    }
    public T remove(int index)
    {
        if (isEmpty() || index < 0 || index > size())
        {
            return null;
        }
        Node<T> p = head;
        Node<T> p1 = null;
        int i = -1;
        while (p != null)
        {
            ++i;
            if (i == index)
            {
                if (p1 == null)
                {
                    head = head.next;
                } else
                {
                    p1.next = p.next;
                }
                return p.value;
            }
            p1 = p;
            p = p.next;
        }
        return null;
    }
}