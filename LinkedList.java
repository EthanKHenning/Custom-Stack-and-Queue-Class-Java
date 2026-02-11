//Strings are upper case S "String", while double, int, char all are lower case for java

// 4 spaces in quotes to copy and paste for indentation purposes and consistency "    "

public class LinkedList
{
    private class Node
    {
        public Node next;
        public String key; 
        public String value; 

        //Node constructor to store split information
        public Node(String key, String value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
     
    private Node head;
    private Node tail;

    public LinkedList()
    {
        this.head = null;
        this.tail = null; 
    }
    
    public String about()
    {
        String about = "This code was brought to you by ETHAN HENNING, first year at Sac State from los rios, a bit lost on Java but giving it a shot" + "\n";
        about = about + "Added this while reviewing code: Java was a little hard to start, everything being in a class was weird at first, however not having to worry about pointers is phenomenal!" + "\n";
        return about;
    }

    public void addHead(String key, String value)
    {
        Node newNode = new Node(key, value);
        if(isEmpty() == true)
        {
            //head = tail
            head = newNode;
            tail = head;
        }
        else
        {
            // adds to the front then redifines the newnode as the head
            newNode.next = head;
            head = newNode;
        }
    }

    public void addTail(String key, String value)
    {
        //just have to add item to next after tail then reassigne as tail after
        Node newNode = new Node(key, value);
        if(head == null)
        {
            tail = newNode;
            head = tail;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    KeyValue removeHead()
    {
        if(isEmpty() == true)
        {
            return null;
        }

        KeyValue keyValue = new KeyValue();
        keyValue.key = head.key ;
        keyValue.value = head.value;
        
        Node oldHead = head;
        
        if(head == tail)
        {
           head = null;
           tail = null;
        }
        else
        {
            head = head.next;
        }

        oldHead.next = null;
 
        return keyValue;
    }

    public boolean isEmpty()
    {
        //check if the list doesn't have any information in it first because I assume most the time it will have information
        if(head != null)
        {
            return false;
        }

        return true;
    } 
    


    public String toList()
    {
        //have to check if the list is empty just incase, don't want to break the code... again
        if(isEmpty() == true)
        {
            return "List is empty";
        }
        
        //starting outputs and initialization for the list
        Node curr = head.next;
        String lineOutPut = head.key + ": " + head.value + "\n";


        //note, while curr != null means that if its just one item in list it will bypass this loop and exit
        while(curr != null)
        {
            lineOutPut = lineOutPut + curr.key + ": " + curr.value + "\n";
            curr = curr.next;
        }

        return lineOutPut;
    }
    
}

