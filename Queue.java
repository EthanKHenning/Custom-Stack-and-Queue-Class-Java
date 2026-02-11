public class Queue 
{

    private LinkedList list;

    public Queue()
    {
        list = new LinkedList();
    }

    void enqueue(KeyValue item)
    {
        list.addTail(item.key, item.value);
    }
    
    KeyValue dequeue()
    {
       return list.removeHead();
    }
    
    boolean isEmpty()
    {
        return list.isEmpty();
    }

    String toList()
    {
        return list.toList();
    }
}

