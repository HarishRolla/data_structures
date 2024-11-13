// stack = LIFO data structure. (LAST IN FIRST OUT)
//          stores objects into a sort of " vertical tower"
//          push() to add to the top
//          pop() to remove from the top
import java.util.Stack;

public class Stack_preparation {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty()); // this will return true or false
         stack.push("harish");
         stack.push("pavan");
         String test = stack.push("rolla");

         // push - will add dta to our stack
        System.out.println(test);
        // push will add item to the stack and also return the value added to string as shown above in test variable

        // in the same way pop will remove the last added item and also return the item to the string variable

        String test2 = stack.pop();
        System.out.println(test2);


        //to see the top most item in the stack without removing we can use peek() function
        System.out.println(stack.peek());

        //this functions are inheritaded from collections (java)_
        System.out.println(stack.size());
        System.out.println(stack.contains("harish"));
        System.out.println(stack.isEmpty());
        // stack position will start from 1 not from 2

        System.out.println(stack.search("harish"));
        stack.push("rolla");
        System.out.println(stack.search("harish"));
        System.out.println(stack.search("rolla"));

        // the last item added will have index as 1
        System.out.println(stack.search("vanu"));
        // if we are trying to search the item that is not in the stack then it will return -1
        // if we add lot of items to stack we may get "outofmemoryerror: java heap space"

        //use cases of stack
        // 1.  undo/redo feature in test editors
        // 2. moving back/forword through browser history
        // 3. backtracking algorithms( maze, file directories)
        // 4. calling functions (call stack)

    }
}
