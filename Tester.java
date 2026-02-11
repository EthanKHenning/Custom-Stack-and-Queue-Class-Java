import java.util.Scanner; // library used for input and output streams (Java equivalent to #include iostream) shown in video
import java.io.File;
import java.io.FileNotFoundException;

//for java you have to do a scanner input

//4 spaces "    "
public class Tester 
{
    public static void main(String[] args) throws FileNotFoundException //Scanner wouldn't work without
    {
        Stack stack = new Stack();
        Queue queue = new Queue();

        //because java is so object base there are object libraries for reading in files rather than the file stream commands of c++
        //seems you actually have to call the file class to use files?
        File file = new File("california.txt"); 
        Scanner scanner = new Scanner(file);
        

        while(scanner.hasNextLine())
        {
            KeyValue keyValue = new KeyValue();
            String textLine = scanner.nextLine();
            String[] lineSegment = textLine.split(":", 2);

            keyValue.key = lineSegment[0];
            keyValue.value = lineSegment[1];

            stack.push(keyValue);
            queue.enqueue(keyValue);
        }
    
        scanner.close();
            
        System.out.println( "\n" + "Stack: ");
        System.out.println(stack.toList());      //cout is so much less to type
        System.out.println("===========================================");
        System.out.println("\n" +"Queue: ");
        System.out.println(queue.toList());
        
        //just want some better spacing between outputs
        System.out.println(); 

        System.out.println("\n" + "Dequeue, First In First Out (FIFO)");
        while(queue.isEmpty() != true)
        {
            KeyValue keyValue = queue.dequeue();
            System.out.println(keyValue.key + ": " + keyValue.value);   
        }

        System.out.println();
        System.out.println("===========================================");

        System.out.println("\n" + "Pop, First In Last Out (FILO)");
        while(stack.isEmpty() != true)
        {
            KeyValue keyValue = stack.pop();
            System.out.println(keyValue.key + ": " + keyValue.value); 
        }


        //for testing pushes and pops
        System.out.println("\n");

        
        KeyValue sample = new KeyValue();
    

        sample.key = "42: ";             //the meaning of life, good place to start
        sample.value = "dog";
        queue.enqueue(sample);
        sample.key = "43: ";
        sample.value = "cat";
        queue.enqueue(sample);
        sample.key = "44: ";
        sample.value = "fox";
        queue.enqueue(sample);
        queue.dequeue();

        System.out.println("\n" + "Dequeue, First In First Out (FIFO)");
        while(queue.isEmpty() != true)
        {
            KeyValue keyValue = queue.dequeue();
            System.out.println(keyValue.key + ": " + keyValue.value);   
        }

        System.out.println(); 
        System.out.println("===========================================");

        sample.key = "42: ";             //the meaning of life, good place to start
        sample.value = "dog";
        stack.push(sample);
        sample.key = "43: ";
        sample.value = "cat";
        stack.push(sample);
        sample.key = "44: ";
        sample.value = "fox";
        stack.push(sample);
        stack.pop();


        System.out.println("\n" + "Pop, First In Last Out (FILO)");
        while(stack.isEmpty() != true)
        {
            KeyValue keyValue = stack.pop();
            System.out.println(keyValue.key + ": " + keyValue.value); 
        }

         System.out.println(); 
    }
}
