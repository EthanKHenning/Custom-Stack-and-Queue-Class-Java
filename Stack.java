public class Stack 
{
    private LinkedList list;

    public Stack()
    {
        list = new LinkedList();
    }

    void push(KeyValue item)
    {
        list.addHead(item.key, item.value);
    }
    
    KeyValue pop()
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
