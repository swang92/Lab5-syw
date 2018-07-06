**Lab 5 Questions**

**Question 1**
When a constructor is not explicitly stated, the Object comes with a no parameter constructor. 

**Question 2**
All of the LinkedList classes are O(1) except for asList because these methods are looking at the first item in the LinkedList; therefore, it doesn't matter how many elements are in the List. The asList method is O(n) because you essentially traversing through the Nodes (to get node.next). Therefore, this method time complexity is dependent on how many elements (n) are in the LinkedList. Reverse Lines has a time complexity of O(n) because it requires to push every element into the Stack and then at the end, a loop to pop each element. Therefore, it is dependent on the number of elements (n). 

**Question 3 **
You can use a LinkedList and use the getFirst and removeLast methods that would essentially work like push and pop methods without using nodes which we are using the next and data methods. 

**Question 4**
If push and pop return the item itself it is more efficient because you are leveraging the methods as they are intended - only accessing the top of the list. However, this method requires that you append the return to see the complete list. If you push/pop the stack itself, the complexity is dependent on the number of elements. 
