// Linked list = stores nodes in 2 parts ( data + address)
//                  nodes are in non-consecutive memory locations
//                  Elements are linked using pointers

//                          Singly Linked List
//              Node                Node                Node
//      [data | address] --> [data | address] --> [data | address]

//                                          Doubly Linked List
//                  Node                            Node                            Node
//      [address | data | address] <--> [address | data | address] <--> [address | data | address]

//      advantages ?
//      1. dynamic data structure ( allocated needed memory while running)
//      2. Insertion and Deletion of Nodes is Easy --> O(1)
//      3. No/Low memory waste

//      disadvantages?
//      1. Greater memory usage (additional pointer)
//      2. No random access of elements (no index[1])
//      3. Accessing/searching elements is more time consuming. O(n)

//      Uses?
//      1. implement Stacks / Queues
//      2. GPS navigation
//      3. music playlist

import java.util.LinkedList;

public class Linked_List {
    public static void main(String arg[]){
        LinkedList<String> linkedList = new LinkedList<String>();

        // we can treat a linkedlist as  stack
/*        linkedList.push("a");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.pop();*/
        // we can treat linked list as queue
        /*linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");
        linkedList.poll();
*/

        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");
        linkedList.add(2, "E");
        linkedList.remove("b");

        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("a"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("A");
        linkedList.addLast("F");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(first);
        String Last = linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println(Last);

    }
}
