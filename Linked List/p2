//First approach we can think is put the elements in hash table but if there is a duplicate element in another node the algo fails
 //If we put address tha might work

 //Using tortoise -hare or Floyd Warshall Algorithm
 //If thy don't meet then there is no loop'
public class Solution {
    public boolean hasCycle(ListNode head) {

        //Start a slow and a fast pointer

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(slowPtr != null && fastPtr != null && fastPtr.next!=null){

            //Advance both the pointers

            slowPtr= slowPtr.next;
            fastPtr= fastPtr.next.next;

            //If they meet, means we found a loop

            if(slowPtr == fastPtr){
                return true;
            }
        }
        
        return false;
    }
}

//TC= O(n) as we are traversing the linked list atleast once
//SC= O(1) as we are not using any extra space
